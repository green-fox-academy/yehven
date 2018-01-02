public class Boss extends Character{
    public Boss(){
        maxHealthPoint = 2 * level * (int) Math.ceil(Math.random() * 6) + (int) Math.ceil(Math.random() * 6);
        defendPoint = level / 2 * (int) Math.ceil(Math.random() * 6) + (int) Math.ceil(Math.random() * 6)/2;
        strikePoint = level * (int) Math.ceil(Math.random() * 6) + level;
        isAlive = true;
    }
}
