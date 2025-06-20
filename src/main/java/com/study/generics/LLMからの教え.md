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