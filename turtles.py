import turtle
import random
win = turtle.Screen()

zack = turtle.Turtle()
jesse = turtle.Turtle()

zack.speed(12)
jesse.speed(10)

jesse.color("red")
zack.color("blue")

for distance in range (0,50,2):
    zack_angle = random.randrange(0,260)
    jesse_angle = random.randrange(0,180)

    zack.left(zack_angle)
    jesse.left(jesse_angle)

    zack.forward(distance)
    jesse.forward(distance)