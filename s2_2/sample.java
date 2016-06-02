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
