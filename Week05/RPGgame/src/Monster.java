public class Monster extends Character{
    public Monster(){
        maxHealthPoint = 2 * level * (int) Math.ceil(Math.random() * 6);
        defendPoint = level / 2 * (int) Math.ceil(Math.random() * 6);
        strikePoint = level * (int) Math.ceil(Math.random() * 6);
        isAlive = true;
    }
}
