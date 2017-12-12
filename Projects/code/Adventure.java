import java.util.Scanner;
import java.util.Random;

public class Adventure
{
	public static Scanner in = new Scanner(System.in);
	public static String question;
	public static String user = "";
	
	public static void main(String[] args)
	{
		question = "0";
		while (true)
		{
			switch (question)
			{
				case "0":
						System.out.println("You have woken up on the side of a road. You don't know how you\n"
										+ "got here and it must be the middle of the night, but there are no\n"
										+ "street lights around. You can only see where your going because the\n"
										+ "moon is full and is shining bright for you to see the road. An\n"
										+ "iphone is in your pocket but it's dead. The goal is to find someone\n"
										+ "that can help you get home, but be careful who you trust."
										+ "\nHit '1' to continue.");
						question = "0A";
						break;
					
				case "0A":
					user = in.next();
					question = "0B";
					break;

				case "0B":
					System.out.println("\n\n**Items** dead iphone\n"
									+ "You start walking down the street and you see that headlights\n"
									+ "start to approach you. The engine gets louder and the lights get\n"
									+ "closer. The car is finally right behind you and you notcie that it\n"
									+ "does not pass, it just slows to your walking speed. How do you want\n"
									+ "to react?\n"
									+ "[1] start running,\n"
									+ "[2] turn around and look at the driver.");
					question = "1A";

				case "1A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You start running down the street with the car headlights lighting your"
											+ "\nway. The car engine roars and speeds up with you. They are getting "
											+ "\nlouder and louder and then you approach a path that leads into the woods"
											+ "\non your right. You can"
											+ "\n[1] turn onto the path,"
											+ "\n[2] continue to run on the street.");
							question = "2A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "As you turn around, the car shuts its healights off and you lose sight\n"
											+ "of it. Even the moonlight can't shine bright enough to see this dark car... "
											+ "\nYou can"
											+ "\n[1] get closer to where the car vanished from,"
											+ "\n[2] turn back and continue walking.");
							question = "2B";
							break;
					}
					break;

				case "2A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The car speeds past the path and you turn to see it continue down the\n"
											+ "street, but it seems as though it just vanishes within the road. You can"
											+ "\n[1] continue on this path,"
											+ "\n[2] go back to the road.");
							question = "3A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The car speeds up right on your heels and it seems as though you have\n"
											+ "no escape. Right when it seems you cannot run anymore, the headlights\n"
											+ "disappear and the sound of the engine is gone. You slow down to a walk\n"
											+ "and look back to see an empty road. What do you want to do next?"
											+ "\n[1] continue to walk down the street,"
											+ "\n[2] look for the car.");
							question = "3B";
							break;
					}
					break;

				case "2B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk into the road, right to the spot you previously saw the truck\n"
											+ "but there is just some tire marks on the road as if they had slammed on\n"
											+ "their breaks. On the road, right before the tire marks start, it looks like\n"
											+ "there is something on the ground. Would you like to pick it up?"
											+ "\n[1] yes,"
											+ "\n[2] no.");
							question = "4A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk and walk and the road just continues on. The woods on either side,\n"
											+ "no cars in sight, no street lights either. The moon light is the only thing\n"
											+ "lighting your path. You suddenly trip over something and you scrape your knee\n"
											+ "on the road. A little bit of blood drips down, but it's not that bad of a cut.\n"
											+ "What do you want to do?"
											+ "\n[1] clean up the blood with a piece of your shirt,"
											+ "\n[2] look to see what you tripped over,"
											+ "\n[3] get up and keep going down the road.");
							question = "4B";
							break;
					}
					break;

				case "3A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "As you walk farther down the path, and deeper into the woods, the light of the\n"
											+ "moon gets darker and darker. Eventually you will be walking blindly from the\n"
											+ "darkness. Noises of crumbling leaves and snapping branches get louder and more\n"
											+ "consistent all around you. It may not be safe to walk out here much longer. What\n"
											+ "do you want to do?"
											+ "\n[1] attempt to go a little farther down the path,"
											+ "\n[2] turn back to the road.");
							question = "5A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You step onto the road again, look both ways, but still the car is nowhere in\n"
											+ "sight. You start walking again when all of a sudden you hear a growl. This is\n"
											+ "not the sound of an engine growl, but of an animal. Looking to your left you\n"
											+ "see a wolf staring at you with it's golden eyes. What do you do?"
											+ "\n[1] fight,"
											+ "\n[2] flight.");
							question = "5B";
							break;
					}
					break;

				case "3B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "A you turn back to the road, the headlights appear again and are coming straight\n"
											+ "towards you in the opposite direction. You have just enough time to jump out of\n"
											+ "the way and you tumble into the woods. The car turns and shines their lights\n"
											+ "straight on you, but does not move closer since there are trees in the way. What\n"
											+ "do you want to do?"
											+ "\n[1] run deeper into the woods,"
											+ "\n[2] walk in the woods but parallel to the road.");
							question = "6A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk over to the spot that you think the car vanishes from but nothing seems\n"
											+ "to be there. Out of nowhere, you here the engine roar and the lights shoot down\n"
											+ "on you. The car hits you... You lose.");
							//				+ "Do you want to play again?\n[1] yes,\n[2] no.);

							question = "100";
							break;
					}
					break;

				case "4A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "The item seems to be a lighter. This could become useful later. What do you want\n"
											+ "to do now?"
											+ "\n[1] continue walking down the street,"
											+ "\n[2] stay put and wait for another car.");
							question = "7A";
							break;
							
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "What do you want to do next?"
											+ "\n[1] continue walking,"
											+ "\n[2] stay put and wait for another car.");
							question = "7B";
							break;
					}
					break;
					
				case "4B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, bloody cloth\n"
											+ "You rip a strand from your shirt and wipe up the blood. It's not much blood, but\n"
											+ "enough to drip down your leg. Would you like to see what you tripped over now?"
											+ "\n[1] yes,"
											+ "\n[2] no.");
							question = "8A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You look down and see what looks like a long stick. You look closer and see that\n"
											+ "there is a spear head tied to the top. Want to take it?"
											+ "\n[1] yes and continue walking,"
											+ "\n[2] no and continue walking.");
							question = "8B";
							break;
							
						case "3":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk a little farther and then you hear a low growl. You see a dark wolf with\n"
											+ "yellow eyes staring right at you. What should you do?"
											+ "\n[1] stand your ground,"
											+ "\n[2] run away.");
							question = "8C";
							break;
					}
					break;
					
				case "5A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You keep going down the path up until the point where you cannot see your own\n"
											+ "hand in front of your face. Then you see a light. Very far in the distance, but\n"
											+ "it is definetly there. What do you want to do?"
											+ "\n[1] go towards the light,"
											+ "\n[2] find your way back towards the road.");
							question = "9A";
							break;
							
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk down the path in the direction you think the road is in. You keep\n"
											+ "walking but it seems a little farther than you remember. It is still just as dark\n"
											+ "as before, as if the moon has left the sky. The only sound you hear is your feet\n"
											+ "on the gravel path below. The road is nowhere to be found ahead of you and you\n"
											+ "really cannot see anything in front of you. What do you want to do?"
											+ "\n[1] stay put until the sun comes up,"
											+ "\n[2] keep walking.");
							question = "9B";
							break;
					}
					break;
					
				case "5B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You stand tall and are ready for the wolf to pounce. It slowly walks towards you,\n"
											+ "teeth bared, eyes squinting. You are waiting for the attack but then the wolf\n"
											+ "flies past you. You turn and see a deer falling over with the wolf on top of it.\n"
											+ "What do you want to do now?"
											+ "\n[1] get away now,"
											+ "\n[2] stay near the wolf.");
							in.next();
							question = "10A";
							break;
							
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You start sprinting in the opposite direction of the wolf, but moments later you\n"
											+ "feel it's breath on the back of your legs. The wolf got you. You Lose.");
							//				+ "Do you want to play again?\n[1] yes,\n[2] no.);
							question = "100";
							break;
					}
					break;
					
				case "6A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You get farther and farther into the woods and it gets darker the deeper you go.\n"
											+ "You keep getting branches whipped into your face and body up until you run into\n"
											+ "a wall. Wait...not a wall, but a giant rock. What do you want to do?"
											+ "\n[1] climb over,"
											+ "\n[2] go around.");
							in.next();
							question = "11A";
							break;
							
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "Whoever this driver is knows you have starting walking and starts moving slowly\n"
											+ "down the road with you, almost as if they are lighting a path for you. And\n"
											+ "that's where you fall and you keep falling and falling and falling. Then....\n"
											+ "You lose.");
							//				+ "Do you want to play again?\n[1] yes,\n[2] no.);
							question = "100";
							break;
					}
					break;

					
				case "7A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You turn around to walk and the car appears directly in front of you. The\n"
											+ "headlights are off this time, so you can see slightly inside the car and it\n"
											+ "doesn't look like anyone is driving it. What would you like to do?"
											+ "\n[1] look inside the driver window,"
											+ "\n[2] walk around the car.");
							in.next();
							question = "12A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You sit and wait for what feels like hours. The sun has started to rise and no\n"
											+ "one has passed. It's starting to get very hot out and you will need some water\n"
											+ "and shelter from the sun soon. What do you want to do?"
											+ "\n[1] start walking,"
											+ "\n[2] stay a little longer.");
							question = "12B";
							break;
					}
					break;
					
				case "7B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You turn around to walk and the car appears directly in front of you. The\n"
											+ "headlights are off this time, so you can see slightly inside the car and it\n"
											+ "doesn't look like anyone is driving it. What would you like to do?"
											+ "\n[1] look inside the driver window,"
											+ "\n[2] walk around the car.");
							in.next();
							question = "12A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You sit and wait for what feels like hours. The sun has started to rise and no\n"
											+ "one has passed. It's starting to get very hot out and you will need some water\n"
											+ "and shelter from the sun soon. What do you want to do?"
											+ "\n[1] start walking,"
											+ "\n[2] stay a little longer.");
							question = "12B";
							break;
					}
					break;

				case "8A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, bloody cloth\n"
											+ "You look down and see what looks like a long stick. You look closer and see that\n"
											+ "there is a spear head tied to the top. Want to take it?"
											+ "\n[1] yes and continue walking,"
											+ "\n[2] no and continue walking.");
							in.next();
							question = "14A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone, bloody cloth\n"
											+ "Hit '1' to continue walking.");
							question = "14B";
							break;
					}
					break;

				case "8B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, spear\n"
											+ "The wind seems to be picking up and it's starting to drizzle a little bit. The\n"
											+ "farther you walk the worse the storm is getting. Sorry, you've just been struck\n"
											+ "by lightning. You lose.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The wind seems to be picking up and it's starting to drizzle a little bit. The\n"
											+ "farther you walk the worse the storm is getting. Sorry, you've just been struck\n"
											+ "by lightning. You lose.");
							question = "100";
							break;
					}
					break;
			
				case "8C":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You stand still and the wolf inches closer to you. There is not much you can do\n"
											+ "from here. Then you hear a loud 'CRACK'. The wolf drops to the ground, and a man\n"
											+ "walks out of the woods with a rifle in his hands. What do you want to do?"
											+ "\n[1] explain who you are and that you need to get home,"
											+ "\n[2] run away from him.");
							in.next();
							question = "16A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You turn and start running away from the wolf and you hear its feet runnning\n"
											+ "after you. Then you hear a loud 'CRACK' and you fall over. A hunter thought you\n"
											+ "were an animal. You lose.");
							question = "100";
							break;
					}
					break;

				case "9A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The light continues to get brighter and brighter until it forms the shape of a\n"
											+ "little cottage. All the lights are on. Would you like to knock on the door?"
											+ "\n[1] yes,"
											+ "\n[2] no and walk past.");
							in.next();
							question = "17A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk down the path in the direction you think the road is in. You keep\n"
											+ "walking but it seems a little farther than you remember. It is still just as dark\n"
											+ "as before, as if the moon has left the sky. The only sound you hear is your feet\n"
											+ "on the gravel path below. The road is nowhere to be found ahead of you and you\n"
											+ "really cannot see anything in front of you. What do you want to do?"
											+ "\n[1] stay put until the sun comes up,"
											+ "\n[2] keep walking.");
							question = "9B";
							break;
					}
					break;

				case "9B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You find yourself drifting asleep and you can't stay awake. You fall asleep, the\n"
											+ "only problem here is you don't wake up. Sorry, a pack of wolves got the best of\n"
											+ "you. You lose.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "There is dead silence all around you and you cannot see your own hand in front of\n"
											+ "you. All of a sudden you hear a loud 'CRACK'. A hunter thought you were an\n"
											+ "animal, you lose.");
							question = "100";
							break;
					}
					break;
					
				case "10A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You turn to go and then you hear a loud 'CRACK'. A hunter mistook you for an\n"
											+ "animal, you lose.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The wolf finishes up with the deer and then turns back to you. It stares for\n"
											+ "quite some time. Then it attacks. You were eaten by a wolf, you lose.");
							question = "100";
							break;
					}
					break;
					
				case "11A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "This rock is steeper than you though. You try to climb but it's very slippery.\n"
											+ "You get high enough to see over the trees but then a rock slips under you feet\n"
											+ "and you slip with it. The height took you're life, you lose.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk for what feels like 10 min with your left hand never leaving the rock.\n"
											+ "There has only been on turn in the rock so it doesn't seem like you have made it\n"
											+ "around. Then, it feels like you've step on something soft and fluffy. Whoops, it\n"
											+ "was a bear. You lose.");
							question = "100";
							break;
					}
					break;

				case "12A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You get to the window and still no one is in there, but the car is running. Do\n"
											+ "you want to get in?"
											+ "\n[1] yes,"
											+ "\n[2] no.");
							in.next();
							question = "18A";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You walk around the car and as soon as you get to the back of the car, the lights\n"
											+ "turn on and the engine roars as the vehicle whips around. The was no escape and\n"
											+ "it hit you, you lose.");
							question = "100";
							break;
					}
					break;

				case "12B":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You start walking and a car comes up the road. You wave your hands at it and they\n"
											+ "come to a stop. The old lady driving rolls down her window and asks what you\n"
											+ "need. Do you want to tell her?"
											+ "\n[1] yes, trust her,"
											+ "\n[2] say no thank you and walk away.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone, lighter\n"
											+ "You passed out from dehydration, and there is nothing you can do now. You lose.");
							question = "100";
							break;
					}
					break;
	
				case "14A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone, bloody cloth, spear\n"
											+ "The wind seems to be picking up and it's starting to drizzle a little bit. The\n"
											+ "farther you walk the worse the storm is getting. Sorry, you've just been struck\n"
											+ "by lightning. You lose.");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone, bloody cloth, spear\n"
											+ "The wind seems to be picking up and it's starting to drizzle a little bit. The\n"
											+ "farther you walk the worse the storm is getting. Sorry, you've just been struck\n"
											+ "by lightning. You lose.");
							question = "100";
							break;
					}
					break;
					
				case "16A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You tell him everything that has happened and he tells you that his car is right \n"
											+ "up the street and he can take me to wherever I need to go. Congrats! You found a\n"
											+ "trustworthy person! WINNER!");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You starting running and he shot you for your actions. You lose");
							question = "100";
							break;
					}
					break;
					
				case "17A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "A little old lady opens the door and asks who you are. You tell her everything\n"
											+ "and she lets you right in to plug in your phone in order to get a ride home.\n"
											+ "Congrats, YOU WIN!");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You starting running and he shot you for your actions. You lose");
							question = "100";
							break;
					}
					break;

				case "18A":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "The car has a phone charger and a GPS installed. You can find you way back home!\n"
											+ "Congrats, YOU WIN!");
							in.next();
							question = "100";
							break;
						case "2":
							System.out.println("\n\n**Items** dead iphone\n"
											+ "You walk around the car and as soon as you get to the back of the car, the lights\n"
											+ "turn on and the engine roars as the vehicle whips around. The was no escape and\n"
											+ "it hit you, you lose.");
							question = "100";
							break;
					}
					break;
					
				case "100":
					switch (user = in.next())
					{
						case "1":
							System.out.println("\n\n\n\n------------------------------------------\n\n\n\n");
							in.next();
							question = "0A";
							break;
					}
					break;

			}
		}
	}
}