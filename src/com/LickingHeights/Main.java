package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    drakeEquation();

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

    int N;
    int rStar;
    double f_p;
    int numberOfExoplanets;
    double f_l;
    double f_i;
    double f_c;
    int L;

    Scanner klepto = new Scanner(System.in);

    // To Do: initialize the Scanner to take input and commit
    // To Do:  ask for rStar variable, store the rStar variable, and commit
    // To Do: ask for f_p variable, store the f_p variable, and commit
    // To Do: ask for numberOfExoplanets variable, store the numberOfExoplanets variable, and commit
    // To Do: ask for f_l variable, store f_l variables, and commit
    // To Do: ask for f_i value and commit
    // To Do: ask for f_c value and commit
    // To Do: ask for L value and commit

    N = rStar * f_p * numberOfExoplanets *f_l * f_i * f_c *L;
    System.out.println("The number of extraterrestrial species \n" +
                "that can communicate with us is: " + N);

    System.out.println("AND I'M TELLIN' YA TO KEEP DAT YELLA 'HINNY A YOURS 'WAY FROM MY DAUGH-oh. Hi. Um... hold on a minute.");
    System.out.println("*gunshot*");
    System.out.println("Sorry, I didn't hear you come in. Thjnp must've sent ya for that whole 'Drake Equation' thing. Bunch a' nonsense, if ya ask me.");
    System.out.println("But taint' mine to decide. Thjnp's a god friend. Just remember that, when yu leave here t'night, as far as anyone 'sides us is concerned, nothin' ilegal just happened.");
    System.out.println("Ah, where are my manners. Names Vtgd, and I was literally created by some weird high-school kid for no reason other than to be weird while doing high-school things.");
    System.out.println("Anyways, Thjnp asked me here to get different estimations of how many conquerable-I mean, alien species there are in this galaxy.");
    System.out.println("I'm s'posed ta ask ya fur some values 'cause the estimation's made with some 'quation.");
    System.out.println("Now, the first value, let's see here...");
    System.out.println("*papers rustling");
    System.out.println("A ha! Okay, give me a number divisible by three.");
    rStar = klepto.nextInt();

    


    }

}
