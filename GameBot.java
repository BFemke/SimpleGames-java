import java.util.Random;
import java.util.Scanner;

public class GameBot{

	public static void main(String[] args){
        	Scanner aVariable = new Scanner(System.in);
                System.out.println("Hello, my name is Qwerty. What is yours?");
                String name = aVariable.nextLine(); //Takes keyboard input
                System.out.println("It is nice to meet you " + name + ". Do you want to play a game?");
                String play = aVariable.nextLine(); //takes keyboard input
                String again = "new game";
                if(play.equalsIgnoreCase("no")){
                	System.out.println("Okay, goodbye."); //ends program
                }
                while(play.equalsIgnoreCase("yes")||again.equalsIgnoreCase("New Game")){
                	System.out.println("Do you want to play High Cards, Yes-or-No, or Number Guessing?");
                        String type = aVariable.nextLine();
                        if(type.equalsIgnoreCase("yes or no")||type.equalsIgnoreCase("yes-or-no")){
                        	System.out.println("Okay, when you want to stop asking questions say goodbye or new game. I'm ready, ask your first question.");
                                again = "yes";
                                int dirty = 0;
                                int wrong = 0;
                                int swear = 0;
                                int Qs = 0;
                                while(again.equalsIgnoreCase("yes")){
                                	String question = aVariable.nextLine(); //takes keyboard input
                                        if(question.endsWith("?")){
                                        	if(question.contains("adult")){
                                                	Qs ++;
                                                        System.out.println("No, don't have an age.");
                                                }
                                                else if(question.contains("you love me")){
                                                	Qs ++;
                                                System.out.println("Yes, you are my friend.");
                                              	}
                                                else if(question.contains("you sing")){
                                                	Qs ++;
                                                        System.out.println("Yes I can, but not very well.");
                                                }
                                      		else if(question.contains("like cookies")){
                                                        Qs ++;
                                                        System.out.println("Yes, I love cookies, but too much give me a stomach ache.");
                                                }
                                                else if(question.contains("your sex")){
                                                        Qs ++;
                                                        System.out.println("I am a program, I don't have a gender.");
                                                }
                                                else if(question.contains("sex")||question.contains("butt")||question.contains("penis")||question.contains("vagina")||question.contains("dick")||question.contains("horny")){
                                                        Qs ++;
                                                      	dirty ++;
                                                        if(dirty == 5){
                                                      	System.out.println("You're not a very nice person to talk to, goodbye.");
                                                        return;
                                                        }
                                   		        System.out.println("That isn't very appropriate.");
                                                }
						else if(question.contains("ass")||question.contains("bitch")||question.contains("fuck")||question.contains("hell")){
                                                    	Qs ++;
                                                    	swear ++;
                                                        if(swear == 5){
                                                    		System.out.println("Please learn to stop swearing before playing again, goodbye.");
                                                 		return;
                                                       	}
                                                     	else if(swear == 4){
                                                            	System.out.println("If you don't stop swearing I won't play anymore.");
                                                   	}
                                                    	else if(swear == 3){
                                                           	System.out.println("You are very mean.");
                                                   	}
                                                    	else if(swear == 2){
                                                           	System.out.println("You swore again.");
                                                      	}
                                                  	else if(swear == 1){
                                                           	System.out.println("Swearing isn't very nice.");
                                                   	}

                                    	    	}
                                            	else if(question.contains("?")){
                                                   	System.out.println("I'm not sure.");
                                               	}
                                     	}
                                       	else if(question.contains("goodbye")){
                                           	System.out.println("Goodbye "+name+", you asked "+Qs+" questions. Lets play again some time.");
                                             	return;
                                     	}
                                     	else if(question.equalsIgnoreCase("new game")){
                                            	again = "new game";
                                     	}
                                    	else if(question.contains("ass")||question.contains("bitch")||question.contains("fuck")||question.contains("hell")){
                                            	Qs ++;
                                             	swear ++;
                                             	if(swear == 5){
                                                    	System.out.println("Please learn to stop swearing before playing again, goodbye.");
                                                      	return;
                                              	}
                                            	else if(swear == 4){
                                                    	System.out.println("If you don't stop swearing I won't play anymore.");
                                             	}
                                             	else if(swear == 3){
                                                   	System.out.println("You are very mean.");
                                            	}
                                              	else if(swear == 2){
                                                   	System.out.println("You swore again.");
                                              	}
                                            	else if(swear == 1){
                                                   	System.out.println("Swearing isn't very nice.");
                                             	}

                                  	 	}
                                       	else if(question.endsWith("a")||question.endsWith("b")||question.endsWith("c")||question.endsWith("d")||question.endsWith("e")||question.endsWith("f")||question.endsWith("g")||question.endsWith("h")||question.endsWith("i")||question.endsWith("j")||question.endsWith("k")||question.endsWith("l")||question.endsWith("m")||question.endsWith("n")||question.endsWith("o")||question.endsWith("p")||question.endsWith("q")||question.endsWith("r")||question.endsWith("s")||question.endsWith("t")||question.endsWith("u")||question.endsWith("w")||question.endsWith("x")||question.endsWith("y")||question.endsWith("z")||question.endsWith(".")){
                                      		wrong ++;
                          	               	if(wrong == 5){
                     	                          	System.out.println("I don't think you understand the game, goodbye.");
                             	                      	return;
                                    		}
                     	              	else if(wrong == 4){
                      	                 	System.out.println("How am I suppose to know if it's a question without a question mark!");
                        	      	 	}
                 	              		else if(wrong == 3){
               	                             	System.out.println("I don't think you are good at grammar.");
           	                     		}
											else if(wrong == 2){
												System.out.println("That's not a question again.");
											}
										else if(wrong == 1){
												System.out.println("That's not a question silly, there's no question mark.");
										}
							}
							}
					}
					else if(type.equalsIgnoreCase("high cards")){
						again = highCardGame();
					}
					else if(type.equalsIgnoreCase("number guessing")){
						again = numberGuessingGame();
					}

			if(again.equalsIgnoreCase("goodbye")){
				System.out.println("Goodbye, let's play again sometime soon.");
				return;
			}
		}
	}

	private static int drawCard(){
		Random random = new Random();
		int Num = random.nextInt(13)+1;
		int Suit = random.nextInt(4)+1;

		String number = null;
		switch (Num){
			case 1: number = "Ace";
			break;
			case 2: number = "Two";
			break;
			case 3: number = "Three";
			break;
			case 4: number = "Four";
			break;
			case 5: number = "Five";
			break;
			case 6: number = "Six";
			break;
			case 7: number = "Seven";
			break;
			case 8: number = "Eight";
			break;
			case 9: number = "Nine";
			break;
			case 10: number = "Ten";
			break;
			case 11: number = "Jack";
			break;
			case 12: number = "Queen";
			break;
			case 13: number = "King";
			break;
		}

		String suits = null;
		switch (Suit){
			case 1: suits = "Spades";
			break;
			case 2: suits = "Clubs";
			break;
			case 3: suits = "Diamonds";
			break;
			case 4: suits = "Hearts";
		}

		return Num;
	}
	public static String numberGuessingGame(){
		Scanner aVariable = new Scanner(System.in);
		System.out.println("Okay, you think of a number between 1 and 100, if I am right say correct,");
		System.out.println("if I'm too low say higher, and if I am too high say lower.");
		System.out.println("Are you ready?");
		String ready = aVariable.nextLine();

		if(ready.equalsIgnoreCase("yes")){
			String again = "again";

			while(again.equalsIgnoreCase("again")){
				int numguesses = 1;
				int max = 101;
				int min = 0;
				int win = 0;
				int guess = (max - min) / 2; //formula for random number
				System.out.println(guess);
				String hint = aVariable.nextLine();
				while(win == 0){
					if(hint.equalsIgnoreCase("correct")){
						System.out.println("Yay, it took me " + numguesses + " tries. If you want to play again say again,");
						System.out.println("if you want to stop playing say goodbye, and if you want to play a different");
						System.out.println("game say new game.");
						again = aVariable.nextLine();
						win ++;

					}
					else if(hint.equalsIgnoreCase("higher")){
						min = guess; //49
						guess = (max - min) / 2 + min; //=74 =87 =93 =96 =98
						System.out.println(guess); //prints guess
						numguesses++;
						hint = aVariable.nextLine();
					}
					else if(hint.equalsIgnoreCase("lower")){
						max = guess;
						guess = max -(max - min) / 2 ;
						System.out.println(guess);
						hint = aVariable.nextLine();
						numguesses++;
					}
				}
			}
			return again;
		}
		else{
			System.out.println("Okay");
			return "new game";
		}
	}

	public static String highCardGame(){
		Scanner aVariable = new Scanner(System.in);
		System.out.println("Okay whoever has the highest card wins. Your card will be drawn first.");
		String again = "again";
		System.out.println("Are you ready?");
		String ready = aVariable.nextLine();

		if(ready.equalsIgnoreCase("yes")){
			while(again.equalsIgnoreCase("again")){
				int P1 = drawCard();
				System.out.println("Your card is "+P1);
				int P2 = drawCard();
				System.out.println("My card is "+P2);

				if(P1>P2){
					System.out.println("Congratulations, you win!");
				}
				else if(P2>P1){
					System.out.println("Sorry, you lose.");
				}
				else if(P1 == P2){
					System.out.println("It's a tie, we both win!");
				}
				System.out.println("If you want to play again please say again, if you want to stop playing say goodbye, ");
				System.out.println("if you want to play a different game say new game.");
				again = aVariable.nextLine();
			}
			return again;
		}
		else{
			System.out.println("Okay.");
			return "new game";
		}
	}
}


