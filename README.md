# DungeonsAPi

## Introduction

Api for data Management with basic informations of monsters in D&amp;D universe

## Execution

For execute enter in the DungeonsAPi folder in terminal and write the code below 

>$ mvn spring-boot:run

## What the API could do?

The api permits: 

- Create a new monster 
- Update an existing monster
- Search for an monster by the name
- Show all monsters 
- Delete an existing monster

## The monsters attributes

The API has the following attributes for the monsters

- Name
- Monster Description
- Monster Alignment
- Life Points
- Languages spoken
- XP earned when it gets killed
- Monster Stats
  - Force Attribute
  - Constitution Attribute
  - Dexterity Attribute
  - Wisdom Attribute
  - Intelligence Attribute
  - Charisma Attribute
  
## Manipulating database 
  
 For use the REST API is necessary pass the information through the following HTML methods:
  
### Create a new Monster
  
  > [POST HTTP METHOD] [url/api/v1/monster] [Elements in JSON]
  
### get a certain monster
  
  > [GET HTTP METHOD] [url/api/v1/monster/monsterName]
  
### Updating an existing monster
  
  > [PUT HTTP METHOD] [url/api/v1/monster/monsterName] [Elements in JSON]
  
### Show all monsters created
  
  > [GET HTTP METHOD] [url/api/v1/monster]
  
### Deleting an existing monster
  
  > [DELETE HTTP METHOD] [url/api/v1/monster/monsterName]
  
## Next steps

As I study and improve my knowledge I will add new features and improve what already exists :)
