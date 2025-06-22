関数の定義方法は、その関数の用途と特性によって適切な選択が変わります。それぞれの特徴を整理してみましょう。

## staticメソッドとして定義する場合

**適している場面：**
- クラスと論理的に関連があるが、インスタンスの状態に依存しない処理
- 複数のメソッドから共通して使用される処理
- 単体テストしやすい独立した処理
- 外部からも呼び出される可能性がある処理

```java
public class MathUtils {
    public static double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
```

## メソッド内のローカル関数として定義する場合

**適している場面：**
- そのメソッド内でのみ使用される処理
- メソッドの可読性向上のための処理の分割
- 外部に公開する必要がない内部的な処理
- メソッドの引数や変数にアクセスする必要がある処理

```java
public void processData(List<String> data) {
    // ローカル関数的な使い方（Java 8以降のラムダ式）
    Function<String, String> normalize = str -> str.trim().toLowerCase();
    
    data.stream()
        .map(normalize)
        .collect(Collectors.toList());
}
```

## 判断基準

1. **再利用性**: 他の場所でも使うならstatic、そのメソッドだけならローカル
2. **テスタビリティ**: 単体テストが必要ならstatic
3. **カプセル化**: 実装詳細を隠したいならローカル
4. **メソッドサイズ**: メソッドが長くなりすぎる場合の分割にはローカル関数が有効

一般的には、再利用性とテスタビリティが重要な処理はstaticメソッドとして、特定のメソッド内での処理の整理にはローカル関数を使うのが良いでしょう。