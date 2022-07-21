package baslama;

public class Match {
    Fighter f1;
    Fighter f2;
    int minwight;
    int maxwight;
    Match(Fighter f1,Fighter f2,int minwight,int maxwight){
        this.f1=f1;
        this.f2=f2;
        this.maxwight=maxwight;
        this.minwight=minwight;
    }
    void run(){
        if (ischek()){
            int chance = Math.round((float)Math.random());
            while (this.f1.health>0 &&this.f2.health>0) {
                System.out.println("=================");
                if(chance ==0) {
                    f2.health = f1.hit(f2);
                    System.out.println(this.f2.name + "  kalan sagligi  " + this.f2.health);
                    if (iswin()) {
                        break;
                    }
                    System.out.println("------");
                    f1.health = f2.hit(f1);
                    System.out.println(this.f1.name + "  kalan sagligi  " + this.f1.health);

                    if (iswin()) {
                        break;
                    }
                    System.out.println("-------");
                }

                if(chance ==1) {
                    f1.health = f2.hit(f1);
                    System.out.println(this.f2.name + "  kalan sagligi  " + this.f2.health);
                    if (iswin()) {
                        break;
                    }
                    System.out.println("------");
                    f2.health = f1.hit(f2);
                    System.out.println(this.f1.name + "  kalan sagligi  " + this.f1.health);

                    if (iswin()) {
                        break;
                    }
                    System.out.println("-------");
                }
            }
        }else
            System.out.println("uyumuyor");
    }

    boolean ischek(){
        return (this.f1.wight>=this.minwight&&this.f1.wight<=this.maxwight)&&(this.f2.wight>=this.minwight&&this.f2.wight<=this.maxwight);
    }
    boolean iswin(){
        if (this.f2.health==0){
            System.out.println(this.f1.name+"  kazandi");
            return  true;
        }
        if (this.f1.health==0){
            System.out.println(this.f2.name+"  kazandi");
            return true;
        }
        return false;
    }
}
