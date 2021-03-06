package lesson.work;

import java.util.Random;

/**
 * @Author zhang
 * @Date 2017/11/9 15:55
 * @Content 对战舞台类
 */
public class Stage {
    //盖伦的武器名字
    public String garenWeaponName[] = {"风暴之剑","冰锤","海克斯手枪","饮血剑"};
    //盖伦的武器攻击力
    public int garenWeaponAttack[] = {30,20,24,25};
    //盖伦的技能名字
    public String garenSkillName[]={"降龙掌","铁头功","快刀","巴掌"};
    //盖伦的技能攻击力
    public int garenSkillAttack[]={10,20,30,40};

    //提莫的武器名字
    public String timoWeaponName[] = {"电刀","饮血剑","破败王者","杀戮之剑"};
    //提莫的武器攻击力
    public int timoWeaponAttack[] = {32,30,22,24};
    //提莫的技能名字
    public String timoSkillName[]={"天女散花","玉步","芭蕾","幽魂"};
    //提莫的技能攻击力
    public int timoSkillAttack[]={5,15,25,35};


    public void startWar(Garen garen,TIMO timo) {

        System.out.println("---战斗开始----");

        while(true) {

            //如果有任何一个英雄血量<=0 游戏结束
            if(garen.getHP() <=0 || timo.getHP() <=0){
                if(garen.getHP() <=0){
                    System.out.println(timo.getName() + "战胜了" + garen.getName());
                }else{
                    System.out.println(garen.getName() + "战胜了" + timo.getName());
                }
                break;
            }

            //实例化武器类和技能类 并且赋值给一个叫 garenWeapon的引用
            //这是属于盖伦的武器和技能
            Weapon garenWeapon = new Weapon();
            Skill garenSkill=new Skill();
            //java中的随机数类
            Random garenRandom = new Random(System.currentTimeMillis());
            //随机0-3的一个整数出来
            int garenNumber = garenRandom.nextInt(4);
            //给盖伦的武器和技能设置名字和攻击力
            garenWeapon.setWeaponAttact(garenWeaponAttack[garenNumber]);
            garenWeapon.setWeaponName(garenWeaponName[garenNumber]);
            garenSkill.setSkillEffect(garenSkillAttack[garenNumber]);
            garenSkill.setSkillName(garenSkillName[garenNumber]);

            //实例化武器类和技能类 并且赋值给一个叫 timoWeapon的引用
            //这是属于提莫的武器和技能
            Weapon timoWeapon = new Weapon();
            Skill timoSkill=new Skill();
            Random timoRandon = new Random(System.currentTimeMillis());
            int timoNumber = timoRandon.nextInt(4);
            timoWeapon.setWeaponName(timoWeaponName[timoNumber]);
            timoWeapon.setWeaponAttact(timoWeaponAttack[timoNumber]);
            timoSkill.setSkillEffect(timoSkillAttack[timoNumber]);
            timoSkill.setSkillName(timoSkillName[timoNumber]);

            //盖伦有三种状态 获取武器和技能 攻击提莫 什么也不做
            Random garenAction = new Random(System.currentTimeMillis());
            int num1 = garenAction.nextInt(3) + 1;
            switch(num1){
                case 1 :
                    garen.attack(timo);
                    break;
                case 2 :
                    garen.getWeapon(garenWeapon,garenSkill);
                    break;
                default :
                    System.out.println(garen.getName() + "什么也没做");
                    break;
            }
            //如果有任何一个英雄血量<=0 游戏结束
            if(garen.getHP() <=0 || timo.getHP() <=0){
                if(garen.getHP() <=0){
                    System.out.println(timo.getName() + "战胜了" + garen.getName());
                }else{
                    System.out.println(garen.getName() + "战胜了" + timo.getName());
                }
                break;
            }

            //提莫也有三种状态 获取武器和技能 攻击盖伦 嘲讽盖伦 什么也不做
            Random timoAction = new Random(System.currentTimeMillis());
            int num2 = timoAction.nextInt(3) + 1;
            switch(num2){
                case 1 :
                    timo.attack(garen);
                    break;
                case 2 :
                    timo.getWeapon(timoWeapon,timoSkill);
                    break;
                case 3 :
                    timo.chaofeng();
                    break;
                default :
                    System.out.println(timo.getName() + "什么也没有做");
                    break;
            }

        }

    }

    public static void main(String[] args) {
        //实例化一个盖伦
        Garen garen = new Garen();
        garen.setName("gay伦");
        garen.setAttack(100);
        garen.setHP(1000);
        garen.setDefense(100);
        //实例化一个提莫
        TIMO timo = new TIMO();
        timo.setName("提莫");
        timo.setHP(800);
        timo.setAttack(150);
        timo.setDefense(80);
        //实例化一个对战舞台 调用打架方法
        Stage stage = new Stage();
        stage.startWar(garen,timo);
    }
}
