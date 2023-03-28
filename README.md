Denna rapport ska beskriva hur koden planerades och utvecklades, hur ni ser på kodens uppbyggnad, vad som kunde ha gjorts bättre och annorlunda, samt vad varje gruppmedlem bidragit med i projektet. 


21/03-2023 - Planering/ brainstorming
* Skapar ett skelett/struktur för hur koden ska se ut och börjar experimentera mig fram genom att brainstorma
Såhär har tänker jag mig idag att det kommer kunna se ut
Brainstorming
- Player
  - Hero klass
    - Mage class extends player
    - Warrior class extends player
    - Hunter class extends player
   

- Monster class
 - Specifik/Boss class extends monster


- Class Dungeon
  - Level one
  - Level two
  - Level three
  - Level for
  - Level five
  - Level six
  - Level seven
  - Level eight
  - Level nine
  - Level ten

* Påbörjar kodningen och fokuserar på att få den allmäna Player klassen att fungera. 
* Tips av struktur är taget från tidigare hangman spel, egna anteckninganr från nätet samt RPG repo av Marcus.
Hangman på Kerims repo -> https://github.com/Keeriiim/Uppg4.git
PATH från Jin23 repo -> docs/OOP/Easy/RPGCharacter.md



21/03-2023 - Planering / brainstorming
* Modifierat Klasserna, förbättrar scaling av hp, dmg, defense beroende på lvl.

*  Nu har jag ett program som 1. startar spel 2. avslutas
Vid start får man välja en av två heroes med olika attributer och attacker.(Än så länge är bara warrior igång).
Nu körs spelet automatiskt tills någons hp < 0. Dör monstret går man till nästa stage och monstret skalar upp i attributer.
Även min hero skalar upp.

* Nu ska jag fixa så att man kan välja vilken attack man vill ha
 - Autoattack
   - Double attack (funkar var tredje slag)



28/03-2023 - Planering/ brainstorming
* Fixa en shop class
  - Den ska ha en shopMenu
  - Val av svärd som kostar gold
  - Det som köps ska läggs till i inventory i class hero, finns det redan ska man inte kunna köpa den igen

* Fixa en arraylista för inventory

* Fixa koden så att det står monster.attack(player.hp) och vise versa