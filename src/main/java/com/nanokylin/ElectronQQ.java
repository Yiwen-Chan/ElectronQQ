package com.nanokylin;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactoryJvm;
import net.mamoe.mirai.utils.BotConfiguration;

/**
 * Hello world!
 */
public class ElectronQQ {
    public static void main(String[] args) {
        final Bot bot = BotFactoryJvm.newBot(Long.parseLong("3284933889"), "", new BotConfiguration() {
            {
                fileBasedDeviceInfo("deviceInfo.json");
            }
        });
        bot.login();
        System.out.println("Hello World!");
    }
}
