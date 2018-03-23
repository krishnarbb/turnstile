# Turnstile : State machine.

## 
A Turnstile is a machine that can be modeled by a state machine.  A turnstile, used to control access to subways and amusement park rides, is a gate with three rotating arms at waist height, one across the entryway. Initially the arms are locked, blocking the entry, preventing patrons from passing through. Depositing a coin or token in a slot on the turnstile unlocks the arms, allowing a single customer to push through. After the customer passes through, the arms are locked again until another coin is inserted.

This repo is an implementation of a Turnstile modeled as a state machine.

## 
Pre requisite : Java 8 and above.

##
Compile :
mvn clean install

##
Program Structure :

App : Main program

FSM : A generic FSM class. 

Turnstile : A turnstile which uses FSM as its brain.


