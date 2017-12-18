public class Hero extends Character {
    public Hero(){
        maxHealthPoint = 20 + 3 * (int) Math.ceil(Math.random() * 6);
        defendPoint = 2 * (int) Math.ceil(Math.random() * 6);
        strikePoint = 5 + (int) Math.ceil(Math.random() * 6);
        isAlive = true;
    }
}
