public class Hero {
        private String choosenHero;
        private int lvl;
        private int xp;
        private int hp;
        private int mana;
        private int attack;
        private int defense;
        private boolean alive = true;
        private int gold;
    
    
        public Hero(){}

        public Hero(String choosenHero, int lvl){
            this.choosenHero = choosenHero;
            this.lvl = lvl;
            this.hp = 220 + (lvl * 5);
            this.attack = 66 + (4*lvl);
            this.defense = 20 + (2*lvl);
            this.xp = 10 * (10*lvl);
            this.alive = true;
            this.gold = 1*(100*lvl);
        }

        /**
         * @return the choosenHero
         */
        public String getChoosenHero() {
            return choosenHero;
        }

        /**
         * @param choosenHero the choosenHero to set
         */
        public void setChoosenHero(String choosenHero) {
            this.choosenHero = choosenHero;
        }

        public boolean setAlive(){
            this.alive = true;
            return alive;
        }

        public boolean setDead(){
            this.alive = false;
            return alive;
        }

        public boolean isAlive(){
            return alive;
        }

        public void spellOption(Monster monster){

        }




        /**
         * @return the lvl
         */
        public int getLvl() {
            return lvl;
        }

        /**
         * @param lvl the lvl to set
         */
        public void setLvl(int lvl) {
            this.lvl += lvl;
        }

        /**
         * @return the xp
         */
        public int getXp() {
            return xp;
        }

        /**
         * @param xp the xp to set
         */
        public void setXp(int xp) {
            this.xp += xp;
        }

        /**
         * @return the hp
         */
        public int getHp() {
            return hp;
        }

        /**
         * @param hp the hp to set
         */
        public void setHp(int hp) {
            this.hp += hp;
        }

        /**
         * @return the mana
         */
        public int getMana() {
            return mana;
        }

        /**
         * @param mana the mana to set
         */
        public void setMana(int mana) {
            this.mana += mana;
        }

        /**
         * @return the damage
         */
        public int getAttack() {
            return attack;
        }

        /**
         * @param damage the damage to set
         */
        public void setAttack(int attack) {
            this.attack += attack;
        }

        /**
         * @return the defense
         */
        public int getDefense() {
            return defense;
        }

        /**
         * @param defense the defense to set
         */
        public void setDefense(int defense) {
            this.defense += defense;
        }

        public String attackSound(){
            return "";
        }

        @Override
        public String toString() {
            return getChoosenHero()+":\nlvl = " + lvl + "\nhp = " + hp + "\nAttack = " + attack + "\ndefense = " + defense + "\n";
        }

        
    
        
    
}
