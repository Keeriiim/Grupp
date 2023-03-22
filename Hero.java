public class Hero {
        private String choosenHero;
        private int lvl;
        private int xp;
        private int hp;
        private int mana;
        private int damage;
        private int defense;
    
    
        public Hero(){}
    
        public Hero(String choosenHero, int lvl, int xp, int hp, int mana, int damage, int defense){
            this.choosenHero = choosenHero;
            this.lvl = lvl;
            this.xp = xp;
            this.hp = hp;
            this.mana = mana;
            this.damage = damage;
            this.defense = defense;
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
            this.lvl = lvl;
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
            this.xp = xp;
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
            this.mana = mana;
        }

        /**
         * @return the damage
         */
        public int getDamage() {
            return damage;
        }

        /**
         * @param damage the damage to set
         */
        public void setDamage(int damage) {
            this.damage = damage;
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
            this.defense = defense;
        }

        public String attackSound(){
            return "";
        }

        @Override
        public String toString() {
            return "Hero [choosenHero=" + choosenHero + ", lvl=" + lvl + ", xp=" + xp + ", hp=" + hp + ", mana=" + mana
                    + ", damage=" + damage + ", defense=" + defense + "]";
        }

        
    
        
    
}
