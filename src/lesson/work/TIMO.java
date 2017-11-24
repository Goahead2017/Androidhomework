package lesson.work;

/**
 * @Author zhang
 * @Date 2017/11/9 15:51
 * @Content
 */
public class TIMO extends Hero{



    public void attack(Garen garen){

        int anotherHeroLeftHP = 0;
        //提莫拿自己的攻击力去攻击传入的garen
        if(getAttack() <= garen.getHP()+garen.getDefense()){
            //如果提莫攻击力比盖伦的血量和防御力之和还低 说明这次攻击不足以击杀对方
            //我们就把盖伦的HP减去  减去的值应该是提莫当前的攻击力减去防御力的值
            anotherHeroLeftHP = garen.getHP() - getAttack()+getDefense();
            //然后把被攻击的英雄还剩下的血量设置回去
            garen.setHP(anotherHeroLeftHP);

            System.out.println(this.getName() + "攻击了" + garen.getName() + ",当前攻击力" +this.getAttack()+",盖伦防御力为"+garen.getDefense()+",实际造成伤害"+(this.getAttack()-garen.getDefense())+"," +garen.getName() + "HP还剩" + garen.getHP());
        }else{
            //如果提莫的攻击力 比garen的血量和防御力之和还高 那garen就死了 游戏就结束了
            //被攻击的英雄血量设置为0
            garen.setHP(0);
            System.out.println(this.getName() + "攻击了" + garen.getName() + "," + garen.getName() + "HP还剩0");
        }
    }

    //提莫种蘑菇的方法
    public void chaofeng(){
        System.out.println("提莫嘲讽了对面的大傻子");
    }

    //你可以为提莫添加其他有意思的方法 但是记得在调用的时候打印出来
}

