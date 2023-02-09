package com.tiktok.tiktok;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tiktok extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            YmlFile classObj = new YmlFile();
            classObj.fileCheck(player);
        }
        return true;
    }

    public void onEnable() {
        // Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("kit").setExecutor(new Tiktok());
    }
}


class YmlFile {
	   
	Tiktok plugin = Tiktok.getPlugin(Tiktok.class);
   

	public void fileCheck(Player player){
    Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {


		@Override
		public void run() {
			 String playerName = player.getName();
		     String playerUuid = player.getUniqueId().toString();
		     File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("Tiktok").getDataFolder(), File.separator + "PlayerDatabase");
		     File f = new File(userdata, File.separator + playerUuid + ".yml");
		     FileConfiguration playerData = YamlConfiguration.loadConfiguration(f);

		     if (f.exists()) {
		         try {
		        	 Scanner myReader = new Scanner(f);
		             while(myReader.hasNextLine()) {
		            	 
		                 //player.sendMessage(myReader.nextLine());
		                 @SuppressWarnings("unused")
						int delayInSeconds = 10;
		                 final int yAbovePlayer = 5;
		                 final int fusingTimeInSeconds = 3;
		                 String Check = myReader.nextLine();
		                 if (Check.contains("Mirror")) {
		                	 player.sendMessage("You've Recieved A Mirror, Spawning TNT!");
		                     TNTPrimed tnt = (TNTPrimed) player.getWorld().spawnEntity(player.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
		                     tnt.setFuseTicks(fusingTimeInSeconds * 20);
		                 }
		                 if (Check.contains("Ice Cream Cone")) {
		                	 player.sendMessage("You've Recieved A Ice Cream Cone, Giving You Diamonds");
		                	 ItemStack[] items = {new ItemStack(Material.DIAMOND)};
		                	 player.getInventory().addItem(items);
		                 }
		                 if (Check.contains("Tiktok")) {
		                	 player.sendMessage("You've Recieved A Tiktok, Giving You Steak!");
		                	 ItemStack[] items = {new ItemStack(Material.COOKED_BEEF)};
		                	 player.getInventory().addItem(items);
		                 }
		                 if (Check.contains("Rose")) {
		                	 player.sendMessage("You've Recieved A Rose, Giving You Piece of Dirt!");
		                	 ItemStack[] items = {new ItemStack(Material.DIRT)};
		                	 player.getInventory().addItem(items);
		                 }
                   
		                 if (Check.contains("Private Jet")) {
		                	 player.sendMessage("You've Recieved A Private Jet, Now Die!");
		                	 player.setHealth(0); //This will kill you but you need to set the spawn point to either world spawn or wherever
		                 }
		                 if (Check.contains("Swan")) {
		                	 player.sendMessage("You've Recieved A Swan, Clearing Inventory!");
		                	 player.getInventory().clear();
		                 }
		                 if (Check.contains("Cap")) {
		                	 player.sendMessage("You've Recieved A Cap, Spawning Creeper!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
		                 }
		                 if (Check.contains("Galaxy")) {
		                	 player.sendMessage("You've Recieved A Galaxy, GoodBye!");
		                	 Location loc = new Location(Bukkit.getWorld("world"), player.getLocation().getBlockX(), player.getLocation().getBlockY() + 100, player.getLocation().getBlockZ(), 0, 0);
		                	 player.teleport(loc);
		                 }
		                 if (Check.contains("Gamepad")) {
		                	 player.sendMessage("You've Recieved A Gamepad, Spawning EXP Bottles!");
		                	 ItemStack[] items = {new ItemStack(Material.EXPERIENCE_BOTTLE,10)};
		                	 player.getInventory().addItem(items);
		                 }
		                 if (Check.contains("Guitar")) {
		                	 player.sendMessage("You've Recieved A Guitar, Spawning Ravager");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.RAVAGER);
		                 }
		                 if (Check.contains("Confetti")) {
		                	 player.sendMessage("You've Recieved A Confetti, Spawning Vex!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.VEX);
		                 }
		                 if (Check.contains("Money Gun")) {
		                	 player.sendMessage("You've Recieved A Money Gun, Spawning Ender Dragon!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDER_DRAGON);
		                 }
		                 if (Check.contains("Chicken Leg")) {
		                	 player.sendMessage("You've Recieved A Chicken Leg, Spawning Ghast!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.GHAST);
		                 }
		                 if (Check.contains("Hanging Lights")) {
		                	 player.sendMessage("You've Recieved A Gamepad, Spawning Skeleton!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
		                 }
		                 if (Check.contains("Coral")) {
		                	 player.sendMessage("You've Recieved A Coral, Spawning Wither!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER);
		                 }
		                 if (Check.contains("Lollipop")) {
		                	 player.sendMessage("You've Recieved A Lollipop, Spawning Totem!");
		                	 ItemStack[] items = {new ItemStack(Material.TOTEM_OF_UNDYING)};
		                	 player.getInventory().addItem(items);
		                 }
		                 if (Check.contains("Little Crown")) {
		                	 player.sendMessage("You've Recieved A Little Crown, Spawning EnderMan!");
		                	 player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDERMAN);
		                 }
		                 
		                 countLineJava8("Tiktok/PlayerDatabase/5f2a398d-0def-371b-b6f2-2dd87a2a0a61.yml");
		                 PrintWriter writer = new PrintWriter(f);
		                 writer.print("");
		                 writer.close();
		             }
		             myReader.close();

		         } catch (IOException exception) {

		             exception.printStackTrace();
		         }
		     }
			
		} }, 0L, (2 * 20));
     

}

private String readFromInputStream(InputStream inputStream)
    	throws IOException {
    		 StringBuilder resultStringBuilder = new StringBuilder();
    		 try (BufferedReader br
    		   = new BufferedReader(new InputStreamReader(inputStream))) {
    		     String line;
    		     while ((line = br.readLine()) != null) {
    		         resultStringBuilder.append(line).append("\n");
    		     }
    		 }
    	return resultStringBuilder.toString();
   }
    
public static int count;

public static long countLineJava8(String fileName) {

    Path path = Paths.get(fileName);

    long lines = 0;
    try {

        // much slower, this task better with sequence access
        //lines = Files.lines(path).parallel().count();

        lines = Files.lines(path).count();

    } catch (IOException e) {
        e.printStackTrace();
    }
    count = (int)lines;  
    
    return lines;
}
}
