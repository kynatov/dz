public class Main {
    public static Hero heroes[];


    public static void main(String[] args) {

        Magic magic = new Magic();
        magic.setHealth(200);
        magic.setDamage(20);
        magic.setTypeOfSuperpower("Magic применил суперспособность Fire Blast");

        Medik medic = new Medik();
        medic.setHealth(200);
        medic.setDamage(0);
        medic.setTypeOfSuperpower("Medic применил суперспособность Regeneration");

        Warrior warrior = new Warrior();
        warrior.setHealth(250);
        warrior.setDamage(30);
        warrior.setTypeOfSuperpower("Warrior применил суперспособность CRITICAL DAMAGE");


        heroes = new Hero[]{magic, medic, warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.getTypeOfSuperpower());
        }
    }
}