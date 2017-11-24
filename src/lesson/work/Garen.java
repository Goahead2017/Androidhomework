package lesson.work;

/**
 * @Author zhang
 * @Date 2017/11/9 15:31
 * @Content
 */
public class Garen extends Hero{



    public void attack(TIMO timo){

        int anotherHeroLeftHP = 0;
        //盖伦拿自己的攻击力去攻击传入的timo
        if(getAttack() <= timo.getHP()+timo.getDefense()){
            //如果盖伦攻击力比被timo的血量和防御力之和还低 说明这次攻击不足以击杀对方
            //我们就把提莫的HP减去  减去的值应该是盖伦的攻击力减去防御力的值
            anotherHeroLeftHP = timo.getHP() - getAttack()+timo.getDefense();
            //然后把timo还剩下的血量设置回去
            timo.setHP(anotherHeroLeftHP);

            System.out.println(this.getName() + "攻击了" + timo.getName() + "," +"当前攻击力为"+this.getAttack()+"，提莫防御力为"+timo.getDefense()+",实际造成伤害"+(this.getAttack()-timo.getDefense())+ ","+timo.getName() + "HP还剩" + timo.getHP());
        }else{
            //如果盖伦攻击力 比timo的血量和防御力之和还高 那timo就死了 游戏就结束了
            //被攻击的英雄血量设置为0
            timo.setHP(0);
            System.out.println(this.getName() + "攻击了" + timo.getName() + "," + timo.getName() + "HP还剩0");
        }
    }

    //你可以为盖伦添加其他有意思的方法 但是记得在调用的时候打印出来

}