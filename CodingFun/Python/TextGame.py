print()
userChoice = input("Would you like to play a game? (yes/no): ")

if userChoice.lower().strip() == "yes":
    
    choice1 = input("Welcome to the Dream SMP! What would you like to do? Conquer the world (World) or join L'manburg? (Join): ")

    if choice1.lower().strip() == "world":
        choice1 = input("Quackity stands in your way! Do you fight or run?: ")

        if choice1.lower().strip() == "fight":
            print("That was a bad idea. You died!")
        elif choice1.lower().strip() == "run":
            print("You ran as far as you can. You lived to see another day")
        else:
            print("That's not a choice you muffinhead!")

    elif choice1.lower().strip() == "join":
        choice1 = input("Dream stands in your way! Do you fight or run?: ")

        if choice1.lower().strip() == "fight":
            print("That was a bad idea. You died!")
        elif choice1.lower().strip() == "run":
            print("You ran as far as you can. You lived to see another day")
        else:
            print("That's not a choice you muffinhead!")
    else:
        print("That's not a choice you muffinhead!")

elif userChoice.lower().strip() == "no":
    print("Alright. See you next time")

else:
    print("That's not a choice you muffinhead!")