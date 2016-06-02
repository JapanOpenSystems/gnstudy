JOPS出力問題
--------------

問題
```
- "J!" "O!" "P!" "S!" をランダムで出力し続けるプラグラムを記述する
- ただし出力末尾が "J!O!P!S!" になったら "JOPS!JOPS!"と出力して処理を終了する

出力サンプル
---
J!P!S!P!S!J!S!J!S!P!P!J!S!S!S!P!O!S!O!J!O!P!S!JOPS!JOPS!
---
```

条件
```
- 用いる言語は自由
- 最も短いコードを作成した人の優勝とする
```

Javaでのコードサンプル
```java
class Jops {
  public static void main(String[] args) {
    // 出力した最終4文字
    String last4 = "";

    while(true) {
      // 1文字をランダムで抽出し出力
      int randomIndex = (int)(Math.random() * 4);
      String charactor = "JOPS".substring(randomIndex, randomIndex + 1);
      System.out.print(charactor + "!");

      // 最終4文字に結合
      last4 = last4 + charactor;
      // 4文字に丸める
      if (last4.length() > 4) {
        last4 = last4.substring(1);
      }

      // 終了判定
      if (last4.equals("JOPS")) {
        System.out.print("JOPS!JOPS!");
        return;
      }
    }
  }
}
```



コード提出方法
```
ymorika or hmugish までGistのURL または コード自体を送付してください
```

きみの ちょうせんを まってるぜ！！
