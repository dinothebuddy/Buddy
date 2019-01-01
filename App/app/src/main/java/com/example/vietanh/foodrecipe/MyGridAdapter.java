package com.example.vietanh.foodrecipe;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public final class MyGridAdapter extends BaseAdapter {

    private final List<Item>mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public String[] mRecipeTitle = {
            "Thịt kho trứng",
            "Bò xào rau muống",
            "Tôm rang me chua ngọt",
            "Canh chua cá lóc",
            "Cánh gà chiên nước mắm",
            "Mực nhồi thịt chiên giòn ",
            "Bún đậu mắm tôm",
            "Canh kim chi",
            "Bánh căn",
            "Bánh Flan",
    };

    public  String[] mDescriptionTXT = {

            "- Bước 1: Sơ chế \n Rửa sạch thịt heo, hành lá \n - Bước 2: Chế biến \n + Áp chảo phần da heo khoảng 5 phút để da vàng đều rồi luộc sơ thịt khoảng 2-3 phút, cắt thịt thành miếng vuông \n + Làm sốt kho \n Lót 100g hành lá và 5g gừng vào đáy nồi sau đó cho thịt lên trên \n + Đổ sốt ướp vào \n + Kho thịt với lửa nhỏ trong 30 phút \n + Luộc trứng vịt khoảng 5 phút, sau đó vớt ra ngâm nước lạnh rồi lột vỏ, cho trứng vịt vào và kho tiếp 30 phút \n - Bước 3: Thưởng thức \n Múc thịt kho ra tô, trang trí thêm ớt và tiêu \n Ăn kèm với cơm trắng",
            "- Bước 1: Bò sơ chế cắt lát mỏng,rau muống rửa sạch cắt khúc,10 tỏi củ đập dập,5 củ tỏi băm,ướp thịt bò với 1/2m dầu hàu,1/2m nước 1m nước tương,1/3m bột ngọt,1/3m đường,1/2m tiêu \n - Bước 2: Chảo nóng cho tỏi củ, tỏi băm vào phi thơm lên cho rau muống vào, nêm 1/3m đường,1/2m bột ngọt,1/2m nước mắm,1m hạt nêm,chút xíu nước xào với lửa lớn cho rau muống xanh lâu hơn sau khi làm chín,trãi rau muống lên dĩa,chải nóng phi tỏi cho bò vào xào áp chảo bò mềm đậm đà vì mình đã ướp trước",
            "- Bước 1: Cho chảo lên bếp, đổ 1 chút dầu ăn vào để phi tỏi nhé. Phi đến khi nào tỏi vàng thơm là được \n - Bước 2: Tiếp theo, cho tôm vào đảo đều tay. Nêm 1 muỗng hạt nêm, 1 muỗng đường, 1/2 muỗng muối, 1 chút xíu nước mắm vào, trộn đều. Để lửa nhỏ, tiếp tục đảo để cho tôm ngấm đều gia vị \n - Bước 3: Sau khi tôm đã săn lại thì cho nước cốt me đã chuẩn bị trước đó vào, đảo đều liên tục để cho nước cốt me ngấm đều vào tôm. Sau đó cho vài lát ớt vào. (Độ cay tùy khẩu vị của mỗi gia đình nhé). Đun đến khi thấy nước me sệt lại thì cho thêm hành lá và rau ngò đã thái nhỏ vào đảo đều rồi tắt bếp \n - Bước 4: cho tôm ra đĩa dùng với cơm nóng. Có thể rắc thêm chút hạt tiêu vào để mùi vị hấp dẫn hơn nhé.",
            "- Bước 1: Cá lóc làm thịt, rửa sạch, cắt khúc vừa ăn khoảng 2-3 cm, đem ướp với 1 chút tiêu, hạt nêm, nước mắm khoảng 10 phút \n - Bước 2: Các loại rau nấu kèm rửa sạch, tước vỏ (nếu có), đậu bắp, dọc mùng, thơm cắt xéo vừa ăn, cà chua bổ múi cau, rau thơm cắt nhỏ \n - Bước 3: Me vắt cho vào 1 chén nước ấm, dầm cho tan thịt me, chắt lấy nước \n - Bước 4: Đun một nồi nước vừa ăn (khoảng 1 lít), nếu có xương ống bạn ninh kèm cho ngọt nước, nước sôi nêm nếm muối, mắm, hạt nêm, đường, bột ngọt... cho vừa ăn. Cho nước cốt me vào đun sôi cùng \n - Bước 5: Cho thơm vào đun sôi, sau đó thả cá vào đun khoảng 5-7 phút, cá chín vớt ra \n - Bước 6: Cho đậu bắp, cà chua, dọc mùng vào đun sôi, nêm nếm vừa ăn",
            "- Bước 1: (sơ chế nguyên liệu): Cánh gà rửa nước sạch, sau đó rửa lại với nước muối pha loãng cho hết mùi hôi rồi các bạn đem thấm khô, cho vào lò vi sóng quay ít phút (hoặc có thể luộc qua). Làm như vậy bạn cánh gà khi rán sẽ mau chín, tiết kiệm được thời gian rán. Tỏi băm nhỏ \n - Bước 2: Cho cánh gà vào rán ngập dầu với mức lửa to, đến khi lớp da gà có độ giòn và chuyển màu vàng ruộm thì vớt ra. Lót giấy thấm dầu cho bớt độ béo \n - Bước 3: Đem phi thơm tỏi với 1 chút dầu ăn. Khi tỏi thơm hạ lửa nhỏ, cho vào chảo đường và nước mắm theo tỉ lệ: 1:1 (cứ 1 thìa nước mắm kèm một thìa đường). Sau khi ước lượng nước mắm và đường vừa đủ, bật lửa to trở lại rồi thả cánh gà vào, cầm cán chảo lắc qua lắc lại cho hỗn hợp tỏi-mắm-đường ngấm đều. Khi thấy món ăn chuyển màu vàng sánh thì tắt bếp, gắp cánh gà ra đĩa trình bày",
            "- Bước 1: Mực rửa sạch với rượu trắng, gừng, muối. Để ráo \n - Bước 2: Nấm hương, mộc nhĩ ngâm nước nóng cho nở mềm, băm nhỏ, hành lá cũng thái nhỏ, hành khô băm nhỏ. Trộn tất cả với nhau, đập thêm quả trứng như làm nem, thêm 1 thìa hạt nêm, 1/2 thìa mì chính, 1/2 thìa đường, chút hạt tiêu, trộn thật đều cho nhân quyện dẻo \n - Bước 3: Nhồi phần nhân vào mực, lấy tăm xiên vào phần đầu mực cho nhân khỏi trôi ra ngoài. Phần râu mực lát chiên ở ngoài (râu ướp với xíu muối) \n - Bước 4: Cho vào xoong nhỏ nhiều dầu (đủ ngập mực), đợi dầu nóng thì thả mực vào chiên, chiên nhỏ lửa khoảng 15', thỉnh thoảng lật mặt để khỏi cháy \n - Bước 5: Bày ra đĩa, thái khoanh tròn, chấm với tương ớt hoặc sốt me",
            "- Bước 1 (sơ chế nguyên liệu): Đậu phụ cắt thành từng miếng vuông chiên giòn \n Thịt ba chỉ rửa sạch, để ráo nước sau đó cho vào nồi cùng 1 lít nước, luộc chín. Tiếp theo, cắt mỏng thịt ba chỉ và xếp ra đĩa \n Thả từng miếng chả cốm vào chảo dầu chiên lên, lật đều 2 mặt cho đến khi chả cốm giòn \n - Bước 2: Dưa chuột rửa sạch, gọt vỏ, thái miếng \n Tía tô, rau thơm các loại nhặt bỏ cành, lá già, giập úa sau đó rửa sạch, ngâm nước muối loãng khoảng 30 phút rồi vớt ra rổ, vẩy sạch nước. Bún lá cắt miếng vừa ăn \n - Bước 3 (bí kíp pha mắm tôm ngon): Trộn 1 muỗng canh đường, 1 muỗng canh nước cốt chanh, 1 muỗng cà phê bột ngọt, 1 muỗng cà phê ớt băm vào mắm tôm, khuấy đều. Sau đó, bạn cho 2, 3 thìa dầu nóng vừa rán đậu vào, tiếp tục khuấy đều",
            "- Bước 1: Thịt ba chỉ rửa sạch, thái miếng mỏng vừa ăn, ướp với hành tím xắt lát và 1 muỗng cafe gia vị \n Đậu phụ thái từng miếng vuông vừa ăn chiều dài khoảng 2cm \n Kim chi vắt khô nước, thái nhỏ \n - Bước 2: Làm nóng chảo sâu lòng với 1 muỗng cafe dầu ăn, cho hành tím xắt lát vào phi thơm rồi trút thịt vào xào chín \n - Bước 3: Thêm kim chi vào xào cùng khoảng 5 phút cho thịt thấm vị. Thường thì kim chi cũng không quá cay, tuy nhiên nếu bạn không ăn cay tốt thì có thể đổ nước ngập bát kim chi rồi vớt lấy phần kim chi ra xào \n - Bước 4: Thêm nước, nêm 2 muỗng cafe hạt nêm rồi đậy nắp chảo, bật lửa lớn đun sôi rồi bớt lửa, đun khoảng 10-15 phút cho kim chi và thịt thật mềm \n - Bước 5: Lúc này bạn mới thả đậu vào, đảo nhẹ rồi đậy vung đun khoảng 5 phút thì nêm nếm lại gia vị cho vừa ăn. Nếu thích ăn chua nên vắt thêm nước cốt 2 quả quất \n - Bước 6: Cuối cùng thả nấm vào nấu khoảng 3 phút là nấm chín, cho hành lá vào rồi tắt bếp. Sau đó, lấy canh kim chi nấu đậu thịt ra bát, dùng nóng",
            "- Bước 1: Chuẩn bị nửa chén cơm nguội hoặc cơm phơi khô \n - Bước 2: Thịt rửa với nước muối loãng cho sạch sau đó xay nhuyễn. Củ sắn cắt sợi nhỏ và vắt ráo. Cho củ sắn vào tô thịt; cùng hành tây và hành tím bằm nhuyễn rồi nêm đường, hạt nêm, nước mắm và hạt tiêu tùy khẩu vị rồi trộn đều ướp 15p \n - Bước 3: Sau đó lấy thịt nặn từng viên tròn lớn hay nhỏ tùy theo sở thích. Nặn viên thịt xong cho vào xửng hấp chín.Phi thơm hành tỏi băm nhuyễn \n - Bước 4: Cho thêm 2 chén nước xương gà hầm, nước hấp thịt lúc nãy cho vào cùng rồi nêm hạt nêm, đường và muối cho vừa ăn rồi tắt bếp. Khi hỗn hợp nước chấm nguội thì cho thêm 1 muỗng nước mắm vào cho đậm đà \n - Bước 5: Ngâm gạo ít nhất 24h. Gạo sau khi ngâm xong thì cho gạo, cơm nguội và 1/2 muỗng cà phê muối cùng 1,5 chén nước lọc vào máy xay để xay mịn \n - Bước 6: Bắt chảo lên bếp, chảo nóng múc bột vào khuôn, khoảng 2/3 khuôn \n - Bước 7: Đậy nắp lại, thấy mặt bánh se lại thì đập trứng cút lên mặt và đậy nắp lại chờ bánh chín. Hay hột gà đánh đều khi mặt bánh se lại thì dùng muỗng múc hột gà cho vào mặt bánh \n - Bước 8: Bánh chín gắp ra đĩa. Kèm tô nước chấm xíu mại và ớt nếu thích",
            "- Bước 1:  Cho đường và một chút nước vào xoong vặn lửa thật nhỏ đến khi đường cháy đều chuyển sang màu vàng cánh gián, bạn đổ hỗn hợp nêu trên vào khuôn tạo màu bánh caramen \n - Bước 2:  Sữa tươi đổ vào xoong đun lửa to cho sôi bùng lên là được, sau đó đổ toàn bộ hộp sữa đặc và 500ml nước vào xoong khuấy đều.(có thể gia giảm nước nếu bạn thích ăn ngọt nhiều hay ít nhé) \n - Bước 3:  Đập 6 quả trứng ra, chỉ lấy lòng vàng, bỏ lòng trắng để bánh được mịn không bị tanh, đánh 6 quả trứng gà cho thật bông rồi đổ vào xoong sữa \n - Bước 4:  Tiếp tục đổ 2 ống bột vani, khuấy đều hỗn hợp trong xoong khoảng 3 phút là được, sau đó đổ hỗn hợp này vào các khuôn đã có sẵn caramen \n - Bước 5:  Cho khuôn làm bánh vào nồi hấp cách thủy khoảng 30 phút là bánh chín. Trong quá trình hấp cách thủy, cứ 2 phút là bạn mở nắp nồi lau hơi nước mọt lần để tránh hơi nước làm ảnh hưởng đến độ ngon của bánh nhé",
    };

    public static final String[] Ingredients =

            {
                    " Làm sốt kho: 10g muối + 3g ngũ vị hương + 2g tiêu xay + 1g màu gạch tôm + 60g sốt kho thịt + 40g nước tương + 4g hắc xì dầu + 200g rượu trắng + màu đường.",
                    "200 g bò thăn \n 300 g rau muống có lá \n 15 củ tỏi \n Tiêu,đường,bột ngọt,nước mắm,hạt nêm,dầu hàu,nước tương",
                    "Tôm tươi: 300gr (bạn có thể mua tôm sú nhỏ hoặc tôm bạc đều được) \n Me vắt: 50gr \n Tỏi: 5 tép \n Hành lá, ngò, ớt \n Đường, muối, nước mắm, hạt nêm, tiêu xay, hạt điều để tạo màu",
                    "Cá lóc (cá quả): 500 gr \n Thơm: 1/4 trái \n Thơm: 1/4 trái \n Đậu bắp: 50gr \n Bạc hà: 50gr \n Me vắt: 20gr \n Giá đỗ: 50gr \n Rau ngỗ (ngò gai): 10gr \n Gia vị: nước mắm, muối, đường, hạt nêm, tiêu bột, ớt \n \n \n \n ",
                    "400g cánh gà \n Đường: 2 muỗng \n Nước mắm: 2 muỗng \n Tỏi: 2 củ",
                    "Mực ống nhỏ vừa 6 con \n Thịt xay có lẫn chút mỡ, không nên xay quá nhỏ hoặc mịn 200g \n 8 cái Nấm hương \n 1 cái Mộc nhĩ \n Hành lá \n 2 củ Hành khô \n Trứng gà 1 quả",
                    "Đậu phụ chiên: 10 miếng \n Thịt ba chỉ: 500gr \n Chả cốm: 300gr \n Bún tươi: 1kg \n Mắm tôm: 1/2 bát \n Ớt băm 1 muỗng cà phê \n Nước cốt chanh 1 muỗng canh \n Đường trắng 1 muỗng canh \n Bột ngọt 1 muỗng cà phê \n Dầu ăn 6 muỗng canh \n Tía tô 100gr, rau thơm các loại 50gr \n Dưa chuột: 3 quả \n \n \n \n ",
                    "1 hộp đậu phụ non hoặc 2-3 bìa \n 200g thịt ba chỉ \n Kim chi \n Nấm hải sản hoặc tùy sở thích \n Hành tím, hành lá, ớt \n Gia vị \n \n \n ",
                    "1 chén gạo \n 1/2 chén cơm nguội \n 400 gr thịt nạc dăm \n 1/2 cái củ sắn \n Hành tây, hành tím, tỏi, hẹ hay hành lá và gia vị \n 15 quả trứng cút \n 3 quả trứng gà \n \n \n \n ",
                    "06 quả trứng gà ( Bạn nên chọn trứng gà ta cho ngon và có lòng đỏ trứng nhiều nhé ) \n 250ml sữa bò tươi \n 1 hộp sữa đặc có đường \n 100g đường \n 2 ống vani \n 500ml nước sôi \n Ngoài ra bạn cần có khuôn làm bánh và nồi hấp cách thủy\n \n \n",
            };



    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.thit, R.drawable.boxao, R.drawable.tomme, R.drawable.cccl, R.drawable.cgcnl, R.drawable.mntc, R.drawable.bdmt, R.drawable.ckc, R.drawable.bc, R.drawable.bf,
    };


    public MyGridAdapter(Context context){
        mInflater = LayoutInflater.from(context);



        mItems.add(new Item("Thịt kho trứng", R.drawable.thit ) );
        mItems.add(new Item("Bò xào rau muống", R.drawable.boxao ) );
        mItems.add(new Item("Tôm rang me chua ngọt", R.drawable.tomme ) );
        mItems.add(new Item("Canh chua cá lóc", R.drawable.cccl ) );
        mItems.add(new Item("Cánh gà chiên nước mắm", R.drawable.cgcnl ) );
        mItems.add(new Item("Mực nhồi thịt chiên", R.drawable.mntc ) );
        mItems.add(new Item("Bún đậu mắm tôm", R.drawable.bdmt ) );
        mItems.add(new Item("Canh kim chi", R.drawable.ckc ) );
        mItems.add(new Item("Bánh căn", R.drawable.bc ) );
        mItems.add(new Item("Bánh flan", R.drawable.bf ) );

    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return mItems.get(i).drawableId;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;
        if (v==null){

            v= mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text,v.findViewById(R.id.text));
        }

        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);
        Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;

    }

    private static class Item {
        public final String name;
        public final  int  drawableId;
        Item(String name, int drawableId){
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
