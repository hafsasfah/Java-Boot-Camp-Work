package AdventureGameClass;

import java.awt.Component;

import AdventureGameInterface.iCharacter;
import AdventureGameInterface.iNPCFactory;

public class MonsterFactory implements iNPCFactory, iCharacter {

	public String[] monsters = {"Test1","Test2","Test3"};
			Die dice;
			int strength = dice.SixSideRollDie() *3; 
			int dexterity = dice.TwelveSideRollDie() *2;
			int hitPoints = dice.SixSideRollDie() * 2;
			int Wisdom = dice.FourSideRollDie() *2;
			{
			
		
		}
			@Override
			public iCharacter getNPC() {
			
				return new MonsterFactory();
			}
			@Override
			public int getHitPoints() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int getMana() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int getStrength() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int getDexterity() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int getWisdom() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public String getInventory() {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Component getPanel() {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public String attack(iCharacter monster) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public void setHitPoints(int damageTaken) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public boolean deathCheck() {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			public boolean getAlive() {
				// TODO Auto-generated method stub
				return false;
			}
}

