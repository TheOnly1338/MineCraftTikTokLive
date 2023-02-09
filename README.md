# Minecraft Plugin For TikTok Live Gifts
#### Minecraft Plugin To Get Tiktok Gifts Sent To A Live

## Required Before We Start:
* Python3 Installed
* Python Client: https://github.com/isaackogan/TikTokLive
* Eclipse To Compile The Jar File

## How To Setup
#### I would like to point out I wrote this in about 5 minutes so the code is ugly and a mess.

#### Alrighty starting off you need to add "TikTok.java" in eclipse after you have everything set up to build your plugin. (Youtube It If You Need To)<br>
#### Next you need to find the line I have shown in the picture below:


![alt text](https://i.imgur.com/kxuefE6.png)

#### These are where your gifts and what they will do is located (I Was To Lazy To Use YML File For This)<br>

![alt text](https://i.imgur.com/IdsHL6u.png)

#### Change "Mirror" to whatever gift you want to cause the action, change "TNTPrimed" area to whatever code you want to be executed when that gift is received. (You Can Give The Player Diamonds/Dirt/Whatever You Want To Do Here)

#### After you built the plugin you can put it in your server directory and start it and do /kit (Don't Ask Me Why I Set It To /kit), but we are not finished yet. The next step is to set up isaackogans TikTokLive Python Files:

![alt text](https://i.imgur.com/csvGH14.png)

#### Find the "gifts.py" and open it with whatever editor you use. 

#### You need to change the blue circle to your TikTok username (WITH THE "@" SYMBOL)<br>
#### Change the red circles to the name of the file your server create in the plugins\playerDataBase\"Your Player Uuid"
![alt text](https://i.imgur.com/bNTdubP.png)

#### Great now put the "gifts.py" file in the same folder as your player Uuid yml (Somewhere In The Plugins Folder) file and run the script (Make Sure Your Live On TikTok When You Run This)

##### All Done!
