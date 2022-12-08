package study;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */

public class Study {
	public static final String SHOP_SHOIN_00="バナナ";
	public static final String SHOP_SHOIN_01="牛乳";
	public static final String SHOP_SHOIN_02="豚肉";
	public static final String SHOP_SHOIN_03="コロッケ";

	public static void main(String[] args) {
		// ① 定数を全て使って、String型のListを記述してください。
		LinkedHashMap<Integer,String>shohinlist=new LinkedHashMap<>();
		shohinlist.put(0, SHOP_SHOIN_00);
		shohinlist.put(1, SHOP_SHOIN_01);
		shohinlist.put(2, SHOP_SHOIN_02);
		shohinlist.put(3, SHOP_SHOIN_03);


		// ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [shopMapリストにshohinListの1と紐づいた商品を180円で追加している]
         *
         */
		LinkedHashMap<String,Integer>shopMap=new LinkedHashMap<String,Integer>();
		shopMap.put(shohinlist.get(0), 125);
		shopMap.put(shohinlist.get(1), 180);
		shopMap.put(shohinlist.get(2), 350);
		shopMap.put(shohinlist.get(3), 100);



		// ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。

		for(Map.Entry<String,Integer> entry:shopMap.entrySet()){

			System.out.println(entry.getKey()+"="+entry.getValue()+"円になります!");

		}


	}

}
