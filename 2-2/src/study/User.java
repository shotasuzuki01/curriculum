package study;

/**
* User.java
*/


public class User {
	//フィールド変数
	private String userName;
	private int id;
	private String password;

	//コンストラクタ
	public User(String userName,int id,String password) {
		this.userName=userName;
		this.id=id;
		this.password=password;
	}
	 // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
	   // アクセス修飾子:「protected」
	   // メソッド名:「printtAccountInfo」
	protected void printAccountInfo(String userName,int id,String password) {
		System.out.printf("ユーザー名は%s\nIDは%d\nパスワードは、%s",this.userName,this.id,this.password);
	}



}
