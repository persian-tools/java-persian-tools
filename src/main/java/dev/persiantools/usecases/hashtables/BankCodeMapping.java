package com.github.persian.usecases.hashtables;

import java.util.HashMap;

public class BankCodeMapping {

    private final HashMap<Integer, String> mapping;

    public BankCodeMapping(){
        this.mapping = new HashMap<>();
        this.mapping.put(636214,"بانک آینده");
        this.mapping.put(627412,"بانک اقتصاد نوین");
        this.mapping.put(627381,"بانک انصار");
        this.mapping.put(505785,"بانک ایران زمین");
        this.mapping.put(622106,"بانک پارسیان");
        this.mapping.put(627884,"بانک پارسیان");
        this.mapping.put(502229,"بانک پاسارگاد");
        this.mapping.put(639347,"بانک پاسارگاد");
        this.mapping.put(627760,"پست بانک ایران");
        this.mapping.put(585983,"بانک تجارت");
        this.mapping.put(627353,"بانک تجارت");
        this.mapping.put(502908,"بانک توسعه تعاون");
        this.mapping.put(207177,"بانک توسعه صادرات");
        this.mapping.put(627648,"بانک توسعه صادرات");
        this.mapping.put(636949,"بانک حکمت ایرانیان");
        this.mapping.put(585949,"بانک خاورمیانه");
        this.mapping.put(502938,"بانک دی");
        this.mapping.put(504172,"بانک رسالت");
        this.mapping.put(589463,"بانک رفاه کارگران");
        this.mapping.put(621986,"بانک سامان");
        this.mapping.put(589210,"بانک سپه");
        this.mapping.put(639607,"بانک سرمایه");
        this.mapping.put(639346,"بانک سینا");
        this.mapping.put(502806,"بانک شهر");
        this.mapping.put(504706,"بانک شهر");
        this.mapping.put(603769,"بانک صادرات ایران");
        this.mapping.put(903769,"بانک صادرات ایران");
        this.mapping.put(627961,"بانک صنعت و معدن");
        this.mapping.put(639370,"بانک قرض الحسنه مهر");
        this.mapping.put(639599,"بانک قوامین");
        this.mapping.put(627488,"بانک کارآفرین");
        this.mapping.put(603770,"بانک کشاورزی");
        this.mapping.put(639217,"بانک کشاورزی");
        this.mapping.put(505416,"بانک گردشگری");
        this.mapping.put(505426,"بانک گردشگری");
        this.mapping.put(636797,"بانک مرکزی ایران");
        this.mapping.put(628023,"بانک مسکن");
        this.mapping.put(610433,"بانک ملت");
        this.mapping.put(991975,"بانک ملت");
        this.mapping.put(170019,"بانک ملی ایران");
        this.mapping.put(603799,"بانک ملی ایران");
        this.mapping.put(606373,"بانک مهر ایران");
        this.mapping.put(505801,"موسسه کوثر");
        this.mapping.put(606256,"موسسه اعتباری ملل");
        this.mapping.put(628157,"موسسه اعتباری توسعه");
    }

    public HashMap<Integer, String> getBankDetails() {
        return mapping;
    }

}
