import java.util.ArrayList;
public class Hero {
        private String choosenHero;
        private int lvl;
        private int hp;
        private int attack;
        private int defense;
        private boolean alive = true;
        private int gold = 0;
        ArrayList <String> inventory = new ArrayList<>();
    
    
        public Hero(){}

        public Hero(String choosenHero, int lvl){
            this.choosenHero = choosenHero;
            this.lvl = lvl;
            this.hp = 220 + (lvl * 5);
            this.attack = 45;
            this.defense = 20 + (2*lvl);
            this.alive = true;
        }

        public String getChoosenHero() {
            return choosenHero;
        }

        public boolean isAlive(){
            return alive;
        }
        
        public boolean setAlive(){
            this.alive = true;
            return alive;
        }

        public boolean setDead(){
            this.alive = false;
            return alive;
        }

      
        public int getAttack() {
            return attack;
        }

        public void setAttack(int lvl){
            this.attack += 5;
        }
       
        public void setBonusAttack(int attack) {
            this.attack += attack;
        }

        public int getDefense(){
            return defense;
        }
    
        public int getHp() {
            return hp;
        }

      
        public void setHp(int hp) {
            this.hp += hp;
        }

        public int getLvl(){
            return lvl;
        }

        public void setLvl(int lvl) {
            this.lvl += lvl;
        }

        public int getGold(){
            return this.gold;
        }

        public void setGold(int gold){
             this.gold += gold;
        }

       
    

        public void spellOption(Monster monster){

        }

        public String printAttackSound(){
            return "";
        }

        
        
    
        
    
}
