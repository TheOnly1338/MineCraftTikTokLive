# Minecraft Plugin For TikTok Live Gifts
#### Minecraft Plugin To Get Tiktok Gifts Sent To A Live

## Required Before We Start:
* Python3 Installed
* Python Client: https://github.com/isaackogan/TikTokLive
* Eclipse To Compile The Jar File

## How To Setup
#### The code is ugly and chaotic because it was written in only a few minutes, I should point out.

#### After you have everything set up to develop your plugin, you need to add "TikTok.java" in Eclipse. (YouTube It If Needed)<br> Next, identify the line that I've highlighted in the illustration below:


![alt text](https://i.imgur.com/kxuefE6.png)

#### These are where your gifts and what they will do is located (I Was To Lazy To Use YML File For This)<br>

![alt text](https://i.imgur.com/IdsHL6u.png)

#### Change "Mirror" to whatever gift you want to cause the action, and change the "TNTPrimed" area to whatever code you want to be executed when that gift is received. You can give the player diamonds, dirt, or whatever you want to do here.

#### After you build the plugin, you can put it in your server directory, start it, and do /kit (don't ask me why I set it to /kit), but we are not finished yet. The following step is to install isaackogan's TikTokLive Python Files: 

![alt text](https://i.imgur.com/csvGH14.png)

#### Find the "gifts.py" and open it with whatever editor you use. 

#### You need to change the blue circle to your TikTok username (WITH THE "@" SYMBOL)<br>
#### Change the red circles to the name of the file your server create in the plugins\playerDataBase\"Your Player Uuid"
![alt text](https://i.imgur.com/bNTdubP.png)

#### Great now put the "gifts.py" file in the same folder as your player Uuid yml (Somewhere In The Plugins Folder) file and run the script (Make Sure Your Live On TikTok When You Run This)

##### All Done!
