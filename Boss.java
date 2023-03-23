public class Boss extends Monster{
    Monster monster;

    public Boss(){}

    public Boss(String creature, int lvl){
        super(creature, lvl);
    }


    public void monsterStory(){
        int random = rand.nextInt(3)+1;
        switch(random){
            case 1:
            System.out.println("A terrible creature has spawned, beware !!!\n");
            break;
            case 2:
            System.out.println("hold your horses, we got some company !!\n");
            break;
            case 3:
            System.out.println("MONSTER AAAAAAAAAAAH !!!\n");
        }
    }


        public void monsterAttack(Hero hero){
            int random = rand.nextInt(2)+1;
        switch(random){
            case 1:
            System.out.println("Dragon breaths fire at you for " + (getAttack()+10) + " damage");
            System.out.println("******* BUURN *******");
            hero.setHp(-(getAttack()+10));
            break;

            case 2:
            System.out.println("Dragon strikes you with it's tail for " + (getAttack()) + " damage");
            System.out.println("******* BAAM *******");
            hero.setHp(-(getAttack()));
            break;
        }
    }


}
    

