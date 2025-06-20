この場合、**通常のメソッド（`getString()`）を使う方が良い**です。

理由：

**メソッドの方が適している場合：**
- シンプルな処理で値を返すだけ
- 可読性が高く、理解しやすい
- パフォーマンスが若干良い（関数型インターフェースのオーバーヘッドがない）
- デバッグしやすい

**Supplierが適している場合：**
- 遅延評価が必要（呼び出されるまで処理を実行したくない）
- 他のメソッドにパラメータとして渡す必要がある
- ストリーミング処理や関数型プログラミングの文脈で使用
- 条件によって異なるSupplierを選択したい

**実用的な例：**
```java
// Supplierが有効な場面
public void processData(Supplier<String> dataSupplier) {
    if (someCondition) {
        String data = dataSupplier.get(); // 必要な時だけ実行
        // 処理...
    }
}

// 使用例
processData(() -> expensiveOperation()); // 条件が満たされた時だけ実行
```

あなたのコードでは単純な文字列を返すだけなので、`getString()`メソッドの方が適切です。

-----
この質問は、Javaにおけるメソッドと関数型インターフェース（Consumer）の使い分けについてですね。

## 主な違いと使い分け

**メソッド（`printString()`）の特徴：**
- 静的で固定的な処理
- 再利用性が高い
- クラス設計の一部として明確な役割を持つ

**関数型インターフェース（`Consumer`）の特徴：**
- 動的で柔軟な処理
- 実行時に処理内容を変更可能
- 高階関数やストリーム処理との親和性が高い

## 具体的な使い分けの例

**メソッドが適している場面：**
```java
// ビジネスロジックとして固定的な処理
public static void validateUser(User user) {
    // バリデーション処理
}

// ユーティリティ的な処理
public static String formatDate(Date date) {
    // 日付フォーマット処理
}
```

**関数型インターフェースが適している場面：**
```java
// 処理内容を動的に変更する場合
public static void processData(List<String> data, Consumer<String> processor) {
    data.forEach(processor);
}

// 使用例：処理内容を呼び出し側で決定
processData(list, System.out::println);           // 出力
processData(list, s -> logger.info(s));           // ログ出力
processData(list, s -> database.save(s));         // DB保存

// ストリーム処理
list.stream()
    .filter(s -> s.length() > 5)
    .forEach(System.out::println);  // Consumer使用
```

## より実践的な例

```java
// 設定によって処理を切り替える
Consumer<String> messageHandler = isDebugMode ? 
    System.out::println : 
    s -> logger.info(s);

// 複数の処理を組み合わせる
Consumer<String> combinedHandler = 
    ((Consumer<String>) System.out::println)
        .andThen(s -> logger.info(s))
        .andThen(s -> database.save(s));
```

**結論：**
- **固定的で再利用可能な処理** → メソッド
- **動的で柔軟性が必要な処理** → 関数型インターフェース
- **ストリーム処理や高階関数** → 関数型インターフェース

あなたのコードでは、単純な出力処理なのでどちらでも問題ありませんが、将来的に処理内容を変更する可能性があるなら`Consumer`の方が柔軟性があります。