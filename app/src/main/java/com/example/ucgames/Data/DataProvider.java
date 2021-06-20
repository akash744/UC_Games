package com.example.ucgames.Data;

import com.example.ucgames.Models.Category;
import com.example.ucgames.Models.Game;
import com.example.ucgames.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataProvider {

    // Game Info Start
    private static Map<Integer, String> generateGameTittles() {
        Map<Integer, String> names =
                new LinkedHashMap<Integer, String>();
        names.put(1,"Ancestors: The Humankind Odyssey");
        names.put(2,"Anno 1800");
        names.put(3,"Ark: Survival Evolved");
        names.put(4,"Assassin's Creed Odyssey");
        names.put(5,"Assassin's Creed Origins");
        names.put(6,"Assassin's Creed Syndicate");
        names.put(7,"Assassin's Creed Unity");
        names.put(8,"Assassin's Creed Valhalla");
        names.put(9,"Borderlands 3");
        names.put(10,"Call of Duty: Black Ops 4");
        names.put(11,"Call of Duty: Black Ops Cold War");
        names.put(12,"Call of Duty: Modern Warfare");
        names.put(13,"Call of Duty: Modern Warfare 2");
        names.put(14,"Call of Duty: Modern Warfare 3");
        names.put(15,"Cities: Skyline");
        names.put(16,"Cyberpunk 2077");
        names.put(17,"DARK SOULS™ : REMASTERED");
        names.put(18,"DARK SOULS™ II: Scholar of the First Sin");
        names.put(19,"DARK SOULS™ III");
        names.put(20,"Darksiders Genesis");
        names.put(21,"Darksiders II");
        names.put(22,"Darksiders III");
        names.put(23,"Days Gone");
        names.put(24,"Destiny 2");
        names.put(25,"Deus Ex: Human Revolution");
        names.put(26,"Deus Ex: Mankind Divided");
        names.put(27,"Diablo III");
        names.put(28,"Disco Elysium");
        names.put(29,"Dishonored");
        names.put(30,"Dishonored 2");
        names.put(31,"Divinity: Original Sin 2");
        names.put(32,"Don't Starve Together");
        names.put(33,"Dragon Age: Inquisitors");
        names.put(34,"Dying Light");
        names.put(35,"Fallout 4");
        names.put(36,"Far Cry 5");
        names.put(37,"Far Cry New Dawn");
        names.put(38,"Far Cry Primal");
        names.put(39,"FIFA 20");
        names.put(40,"FIFA 21");
        names.put(41,"Forza Horizon 4");
        names.put(42,"Grand Theft Auto V");
        names.put(43,"Hitman");
        names.put(44,"Hitman 2");
        names.put(45,"Hitman 3");
        names.put(46,"Horizon Zero Dawn");
        names.put(47,"Just Cause 4");
        names.put(48,"Kingdom Come: Deliverance");
        names.put(49,"Mafia II");
        names.put(50,"Mafia III");
        names.put(51,"Metro Exodus");
        names.put(52,"Middle-earth: Shadow of Mordor");
        names.put(53,"Middle-earth: Shadow of War");
        names.put(54,"Monster Hunter: World");
        names.put(55,"Mount & Blade II: Bannerlord");
        names.put(56,"Need For Speed Heat");
        names.put(57,"Need For Speed Payback");
        names.put(58,"NieR: Automata");
        names.put(59,"Nioh 2");
        names.put(60,"No Man's Sky");
        names.put(61,"Ori and the Blind Forest");
        names.put(62,"Ori and the Will of the Wisps");
        names.put(63,"OUTRIDERS");
        names.put(64,"Overwatch");
        names.put(65,"Planet Coaster");
        names.put(66,"Planet Zoo");
        names.put(67,"Pro Evolution Soccer 2019");
        names.put(68,"Pro Evolution Soccer 2020");
        names.put(69,"Red Dead Redemption 2");
        names.put(70,"Sekiro: Shadows Die Twice");
        names.put(71,"Sid Meier's Civilization V");
        names.put(72,"Sid Meier's Civilization VI");
        names.put(73,"Sleeping Dogs");
        names.put(74,"Sniper Elite 4");
        names.put(75,"Sniper: Ghost Warrior 3");
        names.put(76,"Sniper: Ghost Warrior Contracts 2");
        names.put(77,"Star Wars: The Fallen Order");
        names.put(78,"StarCraft II");
        names.put(79,"The Elder Scrolls V: Skyrim");
        names.put(80,"The Outer Worlds");
        names.put(81,"The Witcher 3: Wild Hunt");
        names.put(82,"Total War: Three Kingdoms");
        names.put(83,"Total War: Warhammer II");
        names.put(84,"Total War: Warhammer III");
        names.put(85,"Tropico 6");
        names.put(86,"Valheim");
        names.put(87,"Warhammer: Vermintide 2");
        names.put(88,"Wasteland 3");
        names.put(89,"Dying Light 2 Stay Human");
        names.put(90,"BIOMUTANT");
        return names;
    }

    private static Map<Integer, String> generateGameRating() {
        Map<Integer, String> ratings =
                new LinkedHashMap<Integer, String>();
        ratings.put(1,"4.5");
        ratings.put(2,"4.7");
        ratings.put(3,"4.5");
        ratings.put(4,"4.7");
        ratings.put(5,"4.4");
        ratings.put(6,"4.2");
        ratings.put(7,"4.8");
        ratings.put(8,"4.2");
        ratings.put(9,"4.6");
        ratings.put(10,"4.8");
        ratings.put(11,"4.3");
        ratings.put(12,"4.2");
        ratings.put(13,"4.3");
        ratings.put(14,"4.5");
        ratings.put(15,"4.2");
        ratings.put(16,"4.1");
        ratings.put(17,"4.6");
        ratings.put(18,"4.2");
        ratings.put(19,"4.5");
        ratings.put(20,"4.8");
        ratings.put(21,"4.3");
        ratings.put(22,"4.1");
        ratings.put(23,"4.9");
        ratings.put(24,"4.8");
        ratings.put(25,"4.4");
        ratings.put(26,"4.3");
        ratings.put(27,"4.8");
        ratings.put(28,"4.2");
        ratings.put(29,"4.6");
        ratings.put(30,"4.6");
        ratings.put(31,"4.6");
        ratings.put(32,"4.6");
        ratings.put(33,"4.3");
        ratings.put(34,"4.8");
        ratings.put(35,"4.8");
        ratings.put(36,"4.4");
        ratings.put(37,"4.3");
        ratings.put(38,"4.8");
        ratings.put(39,"4.2");
        ratings.put(40,"4.3");
        ratings.put(41,"4.5");
        ratings.put(42,"4.8");
        ratings.put(43,"4.9");
        ratings.put(44,"4.6");
        ratings.put(45,"4.6");
        ratings.put(46,"4.1");
        ratings.put(47,"4.8");
        ratings.put(48,"4.2");
        ratings.put(49,"4.2");
        ratings.put(50,"4.5");
        ratings.put(51,"4.2");
        ratings.put(52,"4.4");
        ratings.put(53,"4.2");
        ratings.put(54,"4.1");
        ratings.put(55,"4.7");
        ratings.put(56,"4.4");
        ratings.put(57,"4.8");
        ratings.put(58,"4.7");
        ratings.put(59,"4.3");
        ratings.put(60,"4.7");
        ratings.put(61,"4.6");
        ratings.put(62,"4.3");
        ratings.put(63,"4.7");
        ratings.put(64,"4.3");
        ratings.put(65,"4.6");
        ratings.put(66,"4.2");
        ratings.put(67,"4.3");
        ratings.put(68,"4.2");
        ratings.put(69,"4.4");
        ratings.put(70,"4.3");
        ratings.put(71,"4.2");
        ratings.put(72,"4.9");
        ratings.put(73,"4.1");
        ratings.put(74,"4.4");
        ratings.put(75,"4.8");
        ratings.put(76,"4.5");
        ratings.put(77,"4.2");
        ratings.put(78,"4.5");
        ratings.put(79,"4.4");
        ratings.put(80,"4.9");
        ratings.put(81,"4.6");
        ratings.put(82,"4.3");
        ratings.put(83,"4.8");
        ratings.put(84,"4.6");
        ratings.put(85,"4.7");
        ratings.put(86,"4.2");
        ratings.put(87,"4.6");
        ratings.put(88,"4.1");
        ratings.put(89,"3.8");
        ratings.put(90,"4.2");

        return ratings;
    }

    private static Map<Integer, String> generateDeveloper() {
        Map<Integer, String> developers =
                new LinkedHashMap<Integer, String>();
        developers.put(1,"Panache Digital Games");
        developers.put(2,"Ubisoft Blue Byte");
        developers.put(3,"Studio Wildcard");
        developers.put(4,"Ubisoft Quebec");
        developers.put(5,"Ubisoft Montreal");
        developers.put(6,"Ubisoft Quebec");
        developers.put(7,"Ubisoft Montreal");
        developers.put(8,"Ubisoft Montreal");
        developers.put(9,"Gearbox Software ");
        developers.put(10,"Treyarch");
        developers.put(11,"Treyarch");
        developers.put(12,"Infinity Ward");
        developers.put(13,"Infinity Ward");
        developers.put(14,"Infinity Ward");
        developers.put(15,"Colossal Order");
        developers.put(16,"CD PROJEKT RED");
        developers.put(17,"FromSoftware");
        developers.put(18,"FromSoftware");
        developers.put(19,"FromSoftware");
        developers.put(20,"Airship Syndicate");
        developers.put(21,"Gunfire Games, Vigil Games, THQ Nordic");
        developers.put(22,"Gunfire Games");
        developers.put(23,"Bend Studio");
        developers.put(24,"Bungie Inc");
        developers.put(25,"Eidos Montreal");
        developers.put(26,"Eidos Montreal");
        developers.put(27,"Blizzard Entertainment");
        developers.put(28,"ZA/UM");
        developers.put(29,"Arkane Studios");
        developers.put(30,"Arkane Studios");
        developers.put(31,"Larian Studios");
        developers.put(32,"Klei Entertainment");
        developers.put(33,"Bioware");
        developers.put(34,"Techland");
        developers.put(35,"Bethesda Game Studios");
        developers.put(36,"Ubisoft Montreal");
        developers.put(37,"Ubisoft Montreal");
        developers.put(38,"Ubisoft Quebec");
        developers.put(39,"EA Vancouver");
        developers.put(40,"EA Vancouver");
        developers.put(41,"Playground Games");
        developers.put(42,"Rockstar Games");
        developers.put(43,"IO Interactive A/S");
        developers.put(44,"IO Interactive A/S");
        developers.put(45,"IO Interactive A/S");
        developers.put(46,"Guerrilla");
        developers.put(47,"Avalanche Studios");
        developers.put(48,"Warhorse Studios");
        developers.put(49,"Hangar 13");
        developers.put(50,"Hangar 13");
        developers.put(51,"4A Games");
        developers.put(52,"Monolith Production");
        developers.put(53,"Monolith Production");
        developers.put(54,"CAPCOM Co., Ltd.");
        developers.put(55,"TaleWorlds Entertainment");
        developers.put(56,"Ghost Games");
        developers.put(57,"Ghost Games");
        developers.put(58,"Square Enix, PlatinumGames Inc.");
        developers.put(59,"KOEI TECMO GAMES CO., LTD.");
        developers.put(60,"Hello Games");
        developers.put(61,"Moon Studios");
        developers.put(62,"Moon Studios");
        developers.put(63,"Peopla Can Fly");
        developers.put(64,"Blizzard");
        developers.put(65,"Frontier Developments");
        developers.put(66,"Frontier Developments");
        developers.put(67,"PES Productions");
        developers.put(68,"PES Productions");
        developers.put(69,"Rockstar Games");
        developers.put(70,"FromSoftware");
        developers.put(71,"Firaxis Games");
        developers.put(72,"Firaxis Games");
        developers.put(73,"United Front Games");
        developers.put(74,"Rebellion Developments");
        developers.put(75,"CI Games");
        developers.put(76,"CI Games");
        developers.put(77,"Respawn Entertainment");
        developers.put(78,"Blizzard");
        developers.put(79,"Bethesda Game Studios");
        developers.put(80,"Obsidian Entertainment");
        developers.put(81,"CD PROJEKT RED");
        developers.put(82,"Creative Assembly");
        developers.put(83,"Creative Assembly");
        developers.put(84,"Creative Assembly");
        developers.put(85,"Limbic Entertainment");
        developers.put(86,"Iron Gate AB");
        developers.put(87,"Fatshark");
        developers.put(88,"inXile Entertainment");
        developers.put(89,"Techland");
        developers.put(90,"Experiment 101");

        return developers;
    }

    private static Map<Integer, String> generateGamePublisher() {
        Map<Integer, String> publisher =
                new LinkedHashMap<Integer, String>();
        publisher.put(1,"Private Division");
        publisher.put(2,"Ubisoft");
        publisher.put(3,"Studio Wildcard");
        publisher.put(4,"Ubisoft");
        publisher.put(5,"Ubisoft");
        publisher.put(6,"Ubisoft");
        publisher.put(7,"Ubisoft");
        publisher.put(8,"Ubisoft");
        publisher.put(9,"2K Games");
        publisher.put(10,"Activision");
        publisher.put(11,"Activision");
        publisher.put(12,"Activision");
        publisher.put(13,"Activision");
        publisher.put(14,"Activision");
        publisher.put(15,"Paradox Interactive");
        publisher.put(16,"CD PROJEKT S.A");
        publisher.put(17,"Bandai Namco Games");
        publisher.put(18,"Bandai Namco Games");
        publisher.put(19,"Bandai Namco Games");
        publisher.put(20,"THQ Nordic");
        publisher.put(21,"THQ Nordic");
        publisher.put(22,"THQ Nordic");
        publisher.put(23,"Sony Interactive Entertainment");
        publisher.put(24,"Bungie Inc");
        publisher.put(25,"Square Enix");
        publisher.put(26,"Square Enix");
        publisher.put(27,"Blizzard Entertainment");
        publisher.put(28,"ZA/UM");
        publisher.put(29,"Bethesda Softworks");
        publisher.put(30,"Bethesda Softworks");
        publisher.put(31,"Larian Studios");
        publisher.put(32,"Klei Entertainment");
        publisher.put(33,"Electronic Arts");
        publisher.put(34,"Warner Bros Interactive Entertainment");
        publisher.put(35,"Bethesda Softworks");
        publisher.put(36,"Ubisoft");
        publisher.put(37,"Ubisoft");
        publisher.put(38,"Ubisoft");
        publisher.put(39,"EA Sports");
        publisher.put(40,"EA Sports");
        publisher.put(41,"Xbox Game Studios");
        publisher.put(42,"Rockstar Games");
        publisher.put(43,"IO Interactive A/S");
        publisher.put(44,"Warner Bros Interactive Entertainment");
        publisher.put(45,"IO Interactive A/S");
        publisher.put(46,"Sony Interactive Entertainment");
        publisher.put(47,"Square Enix");
        publisher.put(48,"Deep Silver");
        publisher.put(49,"2K Games");
        publisher.put(50,"2K Games");
        publisher.put(51,"Deep Silver");
        publisher.put(52,"Warne Bros Interactive Entertaiment");
        publisher.put(53,"Warne Bros Interactive Entertaiment");
        publisher.put(54,"CAPCOM Co., Ltd.");
        publisher.put(55,"TaleWorlds Entertainment");
        publisher.put(56,"Electronic Arts");
        publisher.put(57,"Electronic Arts");
        publisher.put(58,"Square Enix");
        publisher.put(59,"KOEI TECMO GAMES CO., LTD.");
        publisher.put(60,"Hello Games");
        publisher.put(61,"XBox Game Studios");
        publisher.put(62,"XBox Game Studios");
        publisher.put(63,"Square Enix");
        publisher.put(64,"Blizzard");
        publisher.put(65,"Frontier Developments");
        publisher.put(66,"Frontier Developments");
        publisher.put(67,"Konami");
        publisher.put(68,"Konami");
        publisher.put(69,"Rockstar Games");
        publisher.put(70,"Bandai Namco Games");
        publisher.put(71,"2K Games");
        publisher.put(72,"2K Games");
        publisher.put(73,"Square Enix");
        publisher.put(74,"Rebellion Developments");
        publisher.put(75,"CI Games");
        publisher.put(76,"CI Games");
        publisher.put(77,"Electronic Arts");
        publisher.put(78,"Blizzard");
        publisher.put(79,"Bethesda Softworks");
        publisher.put(80,"Private Division");
        publisher.put(81,"CD PROJEKT S.A.");
        publisher.put(82,"SEGA");
        publisher.put(83,"SEGA");
        publisher.put(84,"SEGA");
        publisher.put(85,"Kalypso Media");
        publisher.put(86,"Coffee Stain Studios");
        publisher.put(87,"Fatshark");
        publisher.put(88,"Deep Silver");
        publisher.put(89,"Techland");
        publisher.put(90,"THQ Nordic");


        return publisher;
    }

    private static Map<Integer, String> generateGameCategory() {
        Map<Integer, String> categories =
                new LinkedHashMap<Integer, String>();
        categories.put(1,"RPG,Action ");
        categories.put(2,"Strategy,Strategy");
        categories.put(3,"RPG,Action ");
        categories.put(4,"Action ,RPG");
        categories.put(5,"Action,RPG");
        categories.put(6,"Action ,RPG");
        categories.put(7,"Action,RPG");
        categories.put(8,"Action ,RPG");
        categories.put(9,"FPS,RPG");
        categories.put(10,"FPS,Action ");
        categories.put(11,"FPS,Action");
        categories.put(12,"FPS,Action");
        categories.put(13,"FPS,Action ");
        categories.put(14,"FPS,Action ");
        categories.put(15,"Strategy,Strategy");
        categories.put(16,"FPS,RPG");
        categories.put(17,"Action,RPG");
        categories.put(18,"Action ,RPG");
        categories.put(19,"Action ,RPG");
        categories.put(20,"Action,RPG");
        categories.put(21,"Action,RPG");
        categories.put(22,"Action,RPG");
        categories.put(23,"Action,RPG");
        categories.put(24,"FPS,RPG");
        categories.put(25,"Action,RPG");
        categories.put(26,"Action,RPG");
        categories.put(27,"RPG,");
        categories.put(28,"Strategy,RPG");
        categories.put(29,"Action,FPS");
        categories.put(30,"Action,FPS");
        categories.put(31,"Strategy,RPG");
        categories.put(32,"Strategy,RPG");
        categories.put(33,"Action,RPG");
        categories.put(34,"Action,FPS");
        categories.put(35,"FPS,RPG");
        categories.put(36,"FPS,RPG");
        categories.put(37,"FPS,RPG");
        categories.put(38,"FPS,RPG");
        categories.put(39,"Sports,Sports");
        categories.put(40,"Sports,Sports");
        categories.put(41,"Racing,");
        categories.put(42,"Action,RPG");
        categories.put(43,"Action,");
        categories.put(44,"Action,");
        categories.put(45,"Action,");
        categories.put(46,"Action,RPG");
        categories.put(47,"Action,RPG");
        categories.put(48,"FPS,RPG");
        categories.put(49,"Action,RPG");
        categories.put(50,"Action,RPG");
        categories.put(51,"FPS,RPG");
        categories.put(52,"Action,RPG");
        categories.put(53,"Action,RPG");
        categories.put(54,"Strategy,RPG");
        categories.put(55,"Action,RPG");
        categories.put(56,"Racing,");
        categories.put(57,"Racing,");
        categories.put(58,"Action,RPG");
        categories.put(59,"Action,RPG");
        categories.put(60,"Action,RPG");
        categories.put(61,"Action,");
        categories.put(62,"Action,");
        categories.put(63,"RPG,Action");
        categories.put(64,"FPS,Action");
        categories.put(65,"Strategy,");
        categories.put(66,"Strategy,");
        categories.put(67,"Sports,Sports");
        categories.put(68,"Sports,Sports");
        categories.put(69,"Action,RPG");
        categories.put(70,"Action,RPG");
        categories.put(71,"Strategy,Strategy");
        categories.put(72,"Strategy,Strategy");
        categories.put(73,"Action,");
        categories.put(74,"FPS ,Action");
        categories.put(75,"FPS,Action");
        categories.put(76,"FPS,Action");
        categories.put(77,"Action,");
        categories.put(78,"Strategy,Strategy");
        categories.put(79,"Action,RPG");
        categories.put(80,"FPS,RPG");
        categories.put(81,"RPG,Action");
        categories.put(82,"Strategy,Strategy");
        categories.put(83,"Strategy,Strategy");
        categories.put(84,"Strategy,Strategy");
        categories.put(85,"Strategy,Strategy");
        categories.put(86,"RPG,RPG");
        categories.put(87,"FPS,Action");
        categories.put(88,"RPG,Action");
        categories.put(89,"Action,RPG");
        categories.put(90,"Action,RPG");

        return categories;
    }

    private static Map<Integer, String> generateGamePrice() {
        Map<Integer, String> price =
                new LinkedHashMap<Integer, String>();
        price.put(1,"NZ$ 69.95");
        price.put(2,"NZ$ 89.95");
        price.put(3,"NZ$ 14.79");
        price.put(4,"NZ$ 16.74");
        price.put(5,"NZ$ 16.74");
        price.put(6,"NZ$ 24.99");
        price.put(7,"NZ$ 24.99");
        price.put(8,"NZ$ 74.99");
        price.put(9,"NZ$ 29.69");
        price.put(10,"NZ$ 69.69");
        price.put(11,"NZ$ 69.69");
        price.put(12,"NZ$ 69.69");
        price.put(13,"NZ$ 69.69");
        price.put(14,"NZ$ 69.69");
        price.put(15,"NZ$ 9.24");
        price.put(16,"NZ$ 69.69");
        price.put(17,"NZ$ 69.69");
        price.put(18,"NZ$ 69.69");
        price.put(19,"NZ$ 69.69");
        price.put(20,"NZ$ 8.99");
        price.put(21,"NZ$ 20.99");
        price.put(22,"NZ$ 69.69");
        price.put(23,"NZ$ 61.99");
        price.put(24,"NZ$ 69.69");
        price.put(25,"NZ$ 69.69");
        price.put(26,"NZ$ 69.69");
        price.put(27,"NZ$ 69.69");
        price.put(28,"NZ$ 69.69");
        price.put(29,"NZ$ 69.69");
        price.put(30,"NZ$ 69.69");
        price.put(31,"NZ$ 69.69");
        price.put(32,"NZ$ 69.69");
        price.put(33,"NZ$ 69.69");
        price.put(34,"NZ$ 69.69");
        price.put(35,"NZ$ 69.69");
        price.put(36,"NZ$ 69.69");
        price.put(37,"NZ$ 69.69");
        price.put(38,"NZ$ 69.69");
        price.put(39,"NZ$ 69.69");
        price.put(40,"NZ$ 35.28");
        price.put(41,"NZ$ 21.85");
        price.put(42,"NZ$ 69.69");
        price.put(43,"NZ$ 69.69");
        price.put(44,"NZ$ 62.99");
        price.put(45,"NZ$ 69.69");
        price.put(46,"NZ$ 12.57");
        price.put(47,"NZ$ 69.69");
        price.put(48,"NZ$ 69.69");
        price.put(49,"NZ$ 69.69");
        price.put(50,"NZ$ 69.69");
        price.put(51,"NZ$ 69.69");
        price.put(52,"NZ$ 69.69");
        price.put(53,"NZ$ 69.69");
        price.put(54,"NZ$ 69.69");
        price.put(55,"NZ$ 69.69");
        price.put(56,"NZ$ 69.69");
        price.put(57,"NZ$ 69.69");
        price.put(58,"NZ$ 69.69");
        price.put(59,"NZ$ 69.69");
        price.put(60,"NZ$ 69.69");
        price.put(61,"NZ$ 69.69");
        price.put(62,"NZ$ 69.69");
        price.put(63,"NZ$ 69.69");
        price.put(64,"NZ$ 69.69");
        price.put(65,"NZ$ 69.69");
        price.put(66,"NZ$ 69.69");
        price.put(67,"NZ$ 69.69");
        price.put(68,"NZ$ 69.69");
        price.put(69,"NZ$ 69.69");
        price.put(70,"NZ$ 69.69");
        price.put(71,"NZ$ 69.69");
        price.put(72,"NZ$ 69.69");
        price.put(73,"NZ$ 69.69");
        price.put(74,"NZ$ 69.69");
        price.put(75,"NZ$ 69.69");
        price.put(76,"NZ$ 69.69");
        price.put(77,"NZ$ 69.69");
        price.put(78,"NZ$ 36.99");
        price.put(79,"NZ$ 69.69");
        price.put(80,"NZ$ 13.59");
        price.put(81,"NZ$ 69.69");
        price.put(82,"NZ$ 69.69");
        price.put(83,"NZ$ 69.69");
        price.put(84,"NZ$ 69.69");
        price.put(85,"NZ$ 69.69");
        price.put(86,"NZ$ 69.69");
        price.put(87,"NZ$ 69.69");
        price.put(88,"NZ$ 69.69");
        price.put(89,"NZ$ 99.95");
        price.put(90,"NZ$ 104.9");

        return price;
    }

    private static Map<Integer, String> generateGameDescription() {
        Map<Integer, String> descriptions =
                new LinkedHashMap<Integer, String>();
        descriptions.put(1,"\"Embark on the incredible odyssey of human evolution and begin your journey 10 million years ago in this new adventure from the creator of Assassin's Creed.\n" +
                "EXPLORE Neogene Africa at the dawn of humankind. For every breath-taking view dangers lurk all around.\n" +
                "EXPAND your territory by conquering fear as you explore new lands, and grow your clan to find strength in numbers.\n" +
                "EVOLVE over generations and decide what skills to learn. Choose what knowledge passes to future generations, making every player’s journey unique.\"");

        descriptions.put(2,"\"Welcome to the dawn of the Industrial Age. The path you choose will define your world. Are you an innovator or an exploiter? A conqueror or a liberator? How the world remembers your name is up to you.\n" +
                "In Anno 1800, players will take charge of their own fortune as they navigate the rapidly evolving technological landscape and malicious political arena of the 19th century in their quest to build an empire that will reach from the smog-filled cities of Europe to the teeming jungles of South America.\n" +
                "Combining beloved features with innovative gameplay, Anno 1800 is the beginning of a new era for the Anno franchise as players leave their mark on a crucial moment in human history.\"");

        descriptions.put(3,"Stranded on the shores of a mysterious island, you must learn to survive. Use your cunning to kill or tame the primeval creatures roaming the land, and encounter other players to survive, dominate... and escape!");

        descriptions.put(4,"\"Assassin's Creed Odyssey - Standard Edition\n" +
                "From outcast to living legend, embark on an odyssey to uncover the secrets of your past and change the fate of Ancient Greece\n" +
                "TRAVEL TO ANCIENT GREECE\n" +
                "From lush vibrant forests to volcanic islands and bustling cities, start a journey of exploration and encounters in a war torn world shaped by gods and men.\n" +
                "FORGE YOUR LEGEND\n" +
                "Your decisions will impact how your odyssey unfolds. Play through multiple endings thanks to the new dialogue system and the choices you make. Customize your gear, ship, and special abilities to become a legend.\"");

        descriptions.put(5,"\"Standard Edition \n" +
                " Ancient Egypt, a land of majesty and intrigue, is disappearing in a ruthless fight for power. Unveil dark secrets and forgotten myths as you go back to the one founding moment: The Origins of the Assassin’s Brotherhood. \n" +
                " A COUNTRY TO DISCOVER \n" +
                " Sail down the Nile, uncover the mysteries of the pyramids or fight your way against dangerous ancient factions and wild beasts as you explore this gigantic and unpredictable land. \n" +
                " EMBRACE ACTION-RPG \n" +
                " Experience a completely new way to fight. Loot and use dozens of weapons with different characteristics and rarities.\"");

        descriptions.put(6,"\"As Jacob Frye, a young and reckless Assassin, use your skills to help those trampled by the march of progress.\n" +
                "Travel the city at the height of the Industrial Revolution and meet iconic historical figures. From Westminster to Whitechapel, you will come across Darwin, Dickens, Queen Victoria… and many more.\n" +
                "As a gang leader, strengthen your stronghold and rally rival gang members to your cause, in order to take back the capital from the Templars’ hold.\"");

        descriptions.put(7,"\"TAKE OWNERSHIP OF YOUR STORY \n" +
                " Customize Arno's equipement to make the experience unique to you, both visually and mechanically. \n" +
                " THE FRENCH REVOLUTION \n" +
                " Take part in one of the most pivotal moments of French history in a compelling storyline and a breath-taking playground that brought you the city of lights of today. \n" +
                " THE MULTIPLAYER EXPERIENCE \n" +
                " Assassin’s Creed Unity delivers the excitement of playing with up to three friends through online cooperative gameplay in specific missions.\"");

        descriptions.put(8,"\"In Assassin's Creed® Valhalla, become Eivor, a legendary Viking warrior on a quest for glory. Explore England's Dark Ages as you raid your enemies, grow your settlement, and build your political power.\n" +
                "Lead epic Viking raids against Saxon troops and fortresses.\n" +
                "Dual-wield powerful weapons and relive the visceral fighting style of the Vikings.\n" +
                "Challenge yourself with the most varied collection of enemies ever in Assassin's Creed.\n" +
                "Shape the growth of your character with each choice and carve a path to glory.\n" +
                "Explore a Dark Age open world, from the shores of Norway to the kingdoms of England.\n" +
                "Personalize your experience by growing your clan's settlement.\n" +
                "\"");

        descriptions.put(9,"\"The original shooter-looter returns, packing bazillions of guns and an all-new mayhem-fueled adventure! Blast through new worlds and enemies as one of four brand new Vault Hunters – the ultimate treasure-seeking badasses of the Borderlands, each with deep skill trees, abilities and customization. Play solo or join with friends to take on insane enemies, score loads of loot and save your home from the most ruthless cult leaders in the galaxy.\n" +
                "A MAYHEM-FUELED THRILL RIDE\n" +
                "Stop the fanatical Calypso Twins from uniting the bandit clans and claiming the galaxy’s ultimate power.\n" +
                "YOUR VAULT HUNTER, YOUR PLAYSTYLE\n" +
                "Become one of four extraordinary Vault Hunters, each with unique abilities, playstyles, deep skill trees, and tons of personalization options. All Vault Hunters are capable of awesome mayhem alone, but together they are unstoppable.\n" +
                "• Moze as THE GUNNER: When Moze needs backup she Digistructs her mech – Iron Bear – for a sucker punch of additional firepower.\n" +
                "• Amara as THE SIREN: A confident, capable brawler with the ability to summon ethereal fists, Amara uses her Siren powers to smash her enemies.\n" +
                "• FL4K as the BEASTMASTER: FL4K lives for the hunt. So do the loyal beasts that follow their master’s every command. Their preferred prey? Unsuspecting bandits, those poor suckers.\n" +
                "• Zane as the OPERATIVE: Specializing in battlefield gadgetry, Zane is extremely proficient at slipping into combat, creating chaos, and sneaking back out as if he were never there.\n" +
                "LOCK, LOAD, AND LOOT\n" +
                "With bazillions of guns and gadgets, every fight is an opportunity to score new gear. Firearms with self-propelling bullet shields? Check. Rifles that spawn fire-spewing volcanoes? Obviously. Guns that grow legs and chase down enemies while hurling verbal insults? Yeah, got that too.\n" +
                "NEW BORDERLANDS\n" +
                "Discover new worlds beyond Pandora, each featuring unique environments to explore and enemies to destroy. Tear through hostile deserts, battle your way across war-torn cityscapes, navigate deadly bayous and more!\n" +
                "QUICK & SEAMLESS CO-OP ACTION\n" +
                "Play with anyone at any time online or in split-screen co-op, regardless of your level or mission progress. Take down enemies and challenges as a team, but reap rewards that are yours alone – no one misses out on loot.\n" +
                "Incorporates 3rd-party DRM: Denuvo Anti-Tamper\"");

        descriptions.put(10,"\"Featuring gritty, grounded, fluid Multiplayer combat, the biggest Zombies offering ever with three full undead adventures at launch, and Blackout, where the universe of Black Ops comes to life in one massive battle royale experience featuring the largest map in Call of Duty history, signature Black Ops combat, characters, locations and weapons from the entire Black Ops series.\n" +
                "\n" +
                "Multiplayer\n" +
                "Call of Duty®: Black Ops 4 Multiplayer raises the bar, delivering the most thrilling grounded combat experience yet with a focus on tactical gameplay and player choice. The game offers a new level of online action across a variety of new weaponry, maps and modes. For the first time Multiplayer serves as the center of the game’s narrative, as players uncover a deeper connection to the role of each Specialist and their unique playstyles. With the return of the Pick 10 Create-a-Class system – and when combined with the new Gear category – gameplay becomes more customizable than ever, giving players choice over how to power up their Specialists. Combined with the ability to unlock devastating Scorestreaks along the way, players will have the opportunity to be dangerous alone, or unstoppable as a team.\n" +
                "\n" +
                "Zombies\n" +
                "Call of Duty®: Black Ops 4 delivers the biggest Day 1 Zombies offering ever with three full experiences at launch, IX, Voyage of Despair, and Blood of the Dead. With an exciting new adventure and a brand-new cast of characters, Call of Duty: Black Ops 4’s Zombies will feature the deep gameplay and easter eggs that its fans have come to expect.\n" +
                "\n" +
                "Blackout\n" +
                "In Blackout, Black Ops comes to life in one massive battle royale experience, combining Black Ops signature combat and the biggest map in Call of Duty history. Play as fan favorite characters and battle through iconic settings from the Black Ops universe. It’s a collision course bringing together the worlds of Black Ops in an all-out survival and elimination experience featuring weapons; equipment; land, sea, and air vehicles; RC-XDs; traps; and even Zombies in an experience that is uniquely Black Ops.\"");

        descriptions.put(11,"Welcome to the brink. Welcome to Call of Duty®: Black Ops Cold War - the direct sequel to the original and fan-favourite Call of Duty®: Black Ops.");

        descriptions.put(12,"\"One of the most critically-acclaimed games in history, Call of Duty: Modern Warfare is back, remastered in true high-definition, featuring improved textures, physically based rendering, high-dynamic range lighting and much more. Developed by Infinity Ward, the award-winning Call of Duty® 4: Modern Warfare® set a new standard upon its release for intense, cinematic action, while receiving universal praise as one of the most influential video games of all-time. Winner of numerous Game of the Year honors, Call of Duty 4: Modern Warfare became an instant classic and global phenomenon that set the bar for first-person shooters, and now it returns for a new generation of fans.\n" +
                " \n" +
                " Relive one of the most iconic campaigns in history, as you are transported around the globe, including fan favorite missions \"\"All Ghillied Up,\"\" \"\"Mile High Club,\"\" and \"\"Crew Expendable.\"\" You’ll suit up as unforgettable characters Sgt. John \"\"Soap\"\" MacTavish, Capt. John Price and more, as you battle a rogue enemy group across global hotspots from Eastern Europe and rural Russia, all the way to the Middle East. Through an engaging narrative full of twists and turns, call on sophisticated technology and superior firepower as you coordinate land and air strikes on a battlefield where speed and accuracy are essential to victory.\n" +
                " \n" +
                " Additionally, team up with your friends in the online mode that redefined Call of Duty by introducing killstreaks, XP, Prestige and more in customizable, classic multiplayer modes.\"");

        descriptions.put(13,"\"The most-anticipated game of the year and the sequel to the best-selling first-person action game of all time, Modern Warfare 2 continues the gripping and heart-racing action as players face off against a new threat dedicated to bringing the world to the brink of collapse.\n" +
                "Call of Duty®: Modern Warfare 2 features for the first time in video games, the musical soundtrack of legendary Academy Award®, Golden Globe® Award, Grammy® Award and Tony winning composer Hans Zimmer. The title picks up immediately following the historic events of Call of Duty® 4: Modern Warfare®, the blockbuster title that earned worldwide critical acclaim, including:\n" +
                "\"\"Most Played Online Video Game\"\" in history, 2009 Guinness World Records\n" +
                "More than 50 Game of the Year awards, including the Console Game of the Year and Overall Game of the Year, 2007, from the Academy of Interactive Arts & Sciences®\n" +
                "SPECIAL OPS CO-OPERATIVE\n" +
                "An entirely new gameplay mode which supports 2-player co-operative play online that is unique from the single player story campaign.\n" +
                "Special Ops pits players into a gauntlet of time-trial and objective-based missions.\n" +
                "Rank-up as players unlock new Special Ops missions, each more difficult.\n" +
                "Missions include highlights from the single player campaign, fan favorites from Call of Duty 4: Modern Warfare and all new, exclusive missions.\n" +
                "MULTIPLAYER REINVENTED\n" +
                "Setting a new bar for online multiplayer, Modern Warfare 2 multiplayer delivers new capabilities, customization, gamestates and modes, including: Create-a-Class Evolved\n" +
                "Secondary Weapons - Machine Pistols, Shotguns, Handguns, Launchers\n" +
                "Riot Shields\n" +
                "Equipment - Throwing Knives, Blast Shield, Tactical Insertion\n" +
                "Perk Upgrades\n" +
                "Bling (Dual Attachments)\n" +
                "Customizable Killstreaks - AC130, Sentry Gun, Predator Missile, Counter-UAV, Care Package\n" +
                "Accolades (Post match reports)\"");

        descriptions.put(14,"The best-selling first person action series of all-time returns with the epic sequel to multiple “Game of the Year” award winner, Call of Duty®: Modern Warfare® 2. In the world’s darkest hour, are you willing to do what is necessary? Prepare yourself for a cinematic thrill-ride only Call of Duty can deliver. The definitive Multiplayer experience returns bigger and better than ever, loaded with new maps, modes and features. Co-Op play has evolved with all-new Spec-Ops missions and leaderboards, as well as Survival Mode, an action-packed combat progression unlike any other.");

        descriptions.put(15,"\"A Modern Take on the Classic City Simulation\n" +
                "Cities: Skylines is a modern take on the classic city simulation. The game introduces new game play elements to realize the thrill and hardships of creating and maintaining a real city whilst expanding on some well-established tropes of the city building experience. From the makers of the Cities in Motion franchise, the game boasts a fully realized transport system. It also includes the ability to mod the game to suit your play style as a fine counterbalance to the layered and challenging simulation. You’re only limited by your imagination, so take control and reach for the sky!\n" +
                "Multi-tiered and challenging simulation\n" +
                "Constructing your city from the ground up is easy to learn, but hard to master. Playing as the mayor of your city you’ll be faced with balancing essential requirements such as education, water, electricity, police, fire fighting, healthcare and much more along with your citys real economy system. Citizens within your city react fluidly, with gravitas and with an air of authenticity to a multitude of game play scenarios.\n" +
                "Extensive local traffic simulation\n" +
                "Colossal Orders extensive experience developing the Cities in Motion series is fully utilized in fully fleshed out and well-crafted transport systems.\n" +
                "Districts and Policies\n" +
                "Be more than just an administrator from city hall. Designating parts of your city as a district results in the application of policies which results in you rising to the status of Mayor for your own city.\"");

        descriptions.put(16,"\"Cyberpunk 2077 is an open-world, action-adventure story set in Night City, a megalopolis obsessed with power, glamour and body modification. You play as V, a mercenary outlaw going after a one-of-a-kind implant that is the key to immortality. You can customize your character’s cyberware, skillset and playstyle, and explore a vast city where the choices you make shape the story and the world around you.\n" +
                "PLAY AS A MERCENARY OUTLAW\n" +
                "Become a cyberpunk, an urban mercenary equipped with cybernetic enhancements and build your legend on the streets of Night City.\n" +
                "LIVE IN THE CITY OF THE FUTURE\n" +
                "Enter the massive open world of Night City, a place that sets new standards in terms of visuals, complexity and depth.\n" +
                "STEAL THE IMPLANT THAT GRANTS ETERNAL LIFE\n" +
                "Take the riskiest job of your life and go after a prototype implant that is the key to immortality.\n" +
                "Digital goodies included:\n" +
                "Original score\n" +
                "Art booklet featuring a selection of art from the game\n" +
                "Digital Comic \"\"Cyberpunk 2077: Your Voice\"\"\n" +
                "Cyberpunk 2020 sourcebook\n" +
                "Wallpapers for desktop and mobile\"");

        descriptions.put(17,"\"Then, there was fire. Re-experience the critically acclaimed, genre-defining game that started it all. Beautifully remastered, return to Lordran in stunning high-definition detail running at 60fps.\n" +
                "Dark Souls Remastered includes the main game plus the Artorias of the Abyss DLC.\n" +
                "\n" +
                "Key features:\n" +
                "• Deep and Dark Universe\n" +
                "• Each End is a New Beginning\n" +
                "• Gameplay Richness and Possibilities\n" +
                "• Sense of Learning, Mastering and Accomplishment\n" +
                "• The Way of the Multiplayer (up to 6 players with dedicated servers)\"");

        descriptions.put(18,"\"Developed by FROM SOFTWARE, DARK SOULS™ II is the highly anticipated sequel to the gruelling 2011 breakout hit Dark Souls. The unique old-school action RPG experience captivated imaginations of gamers worldwide with incredible challenge and intense emotional reward.\n" +
                "\n" +
                "DARK SOULS™ II brings the franchise’s renowned obscurity & gripping gameplay innovations to both single and multiplayer experiences.\n" +
                "\n" +
                "Join the dark journey and experience overwhelming enemy encounters, diabolical hazards, and the unrelenting challenge that only FROM SOFTWARE can deliver.\n" +
                "Key Features\n" +
                "Go Beyond Death: dare yourself to engage against intense gameplay in a vast world powered by an all new engine that leaps graphics, sound & FX forward like never before\n" +
                "A labyrinth of monsters & bosses: immerse yourself into mind-bending environments filled with new twisted monsters and deadly bosses that could only come from the imagination of FROM SOFTWARE\n" +
                "Sensory assault: a wide range of threats will prey on human senses & phobias - auditory hallucinations, vertigo, acrophobia, etc\n" +
                "Deeper and darker: more intricate customization options provide weapons and armor tailoring to player style\n" +
                "Evolved multiplayer: updated multiplayer system enables improved online interaction to bring forward cooperative & competitive play\n" +
                "Refined gameplay: DARK SOULS™ II features fluid motion-capture animations, an upgraded combat system, a vastly expanded suite of characters, deeper customization options, new weapons, armor abilities, and a balanced player progression system\n" +
                "\"");

        descriptions.put(19,"\"DARK SOULS™ III continues to push the boundaries with the latest, ambitious chapter in the critically-acclaimed and genre-defining series.\n" +
                "\n" +
                "As fires fade and the world falls into ruin, journey into a universe filled with more colossal enemies and environments. Players will be immersed into a world of epic atmosphere and darkness through faster gameplay and amplified combat intensity. Fans and newcomers alike will get lost in the game hallmark rewarding gameplay and immersive graphics.\n" +
                "Now only embers remain… Prepare yourself once more and Embrace The Darkness!\"");

        descriptions.put(20,"\"From the dawn of creation, THE COUNCIL has maintained the Balance across existence. Carrying out their orders are THE HORSEMEN, Nephilim (powerful beings spawned from the unnatural union of angels and demons) who have pledged themselves to the Council and been granted immense power. However, this power came at a tragic cost: the Horsemen were ordered to use their newfound strength to wipe out the rest of their kind. What followed was a bloody battle on Eden where the Horsemen, obeying the will of the Council, annihilated the Nephilim. \n" +
                " \n" +
                " \n" +
                " Still reeling from the events on Eden, WAR and STRIFE have been given a new assignment -- LUCIFER, the enigmatic and deceptive demon king, has been plotting to upset the Balance by granting power to master demons throughout Hell. War and Strife must hunt down these masters, gather information, and ultimately fight their way through a tangled, demonic conspiracy that threatens to forever upset the Balance and unravel all of creation.\"");

        descriptions.put(21,"\"Deathinitive Edition Features: \n" +
                " Darksiders 2 with all DLC included and integrated into the game which offers a total playtime of more than 30 hours \n" +
                " Reworked and tuned game balancing and loot distribution \n" +
                " Improved Graphic Render Engine for higher visual quality especially in terms of lighting and shadows \n" +
                " Improved and reworked level, character and environment graphics \n" +
                " Running in native 1080p resolution \n" +
                " Features: \n" +
                " Play Death: Become the most feared of the legendary Four Horsemen, able to destroy entire worlds and battle forces beyond Heaven and Hell. \n" +
                " Epic Universe: Unlike anything the player has seen before, delivered in the unique style of Joe Mad. \n" +
                " Player Choice & Customization: Customize your experience with varied armor sets, weapons, and Skill Trees allowing players to create their own Death. \n" +
                " Replay-ability: Explore a vast open world, complete dozens of side quests and customize your Death with a full leveling system, Skill Trees and endless equipment combinations. \n" +
                " Traversal: Death is a nimble and agile character capable of incredible acrobatic feats allowing the player to explore the world like never before.\"");

        descriptions.put(22,"Return to an apocalyptic Earth in Darksiders III, a hack-n-slash Action Adventure where players assume the role of FURY in her quest to hunt down and dispose of the Seven Deadly Sins. The most unpredictable and enigmatic of the Four Horsemen, FURY must succeed where many have failed – to bring balance to the forces that now ravage Earth.");

        descriptions.put(23,"\"Brutal open world action-adventure game. \n" +
                " Days Gone is an open-world action-adventure game set in a harsh wilderness two years after a devastating global pandemic. \n" +
                " Step into the dirt flecked shoes of former outlaw biker Deacon St. John, a bounty hunter trying to find a reason to live in a land surrounded by death. Scavenge through abandoned settlements for equipment to craft valuable items and weapons, or take your chances with other survivors trying to eke out a living through fair trade… or more violent means.\"");

        descriptions.put(24,"Dive into the world of Destiny 2 to explore the mysteries of the solar system and experience responsive first-person shooter combat. Unlock powerful elemental abilities and collect unique gear to customize your Guardian's look and playstyle. Enjoy Destiny 2’s cinematic story, challenging co-op missions, and a variety of PvP modes alone or with friends. Download for free today and write your legend in the stars.");

        descriptions.put(25,"You play Adam Jensen, an ex-SWAT specialist who's been handpicked to oversee the defensive needs of one of America's most experimental biotechnology firms. Your job is to safeguard company secrets, but when a black ops team breaks in and kills the very scientists you were hired to protect, everything you thought you knew about your job changes.");

        descriptions.put(26,"\"The year is 2029, and mechanically augmented humans have now been deemed outcasts, living a life of complete and total segregation from the rest of society. \n" +
                " \n" +
                " Now an experienced covert operative, Adam Jensen is forced to operate in a world that has grown to despise his kind. Armed with a new arsenal of state-of-the-art weapons and augmentations, he must choose the right approach, along with who to trust, in order to unravel a vast worldwide conspiracy.\"");

        descriptions.put(27,"Twenty years have passed since the Prime Evils were defeated and banished from the world of Sanctuary. Now, you must return to where it all began – the town of Tristram – and investigate rumors of a fallen star, for this is the first sign of evil’s rebirth, and an omen that the End Times have begun.");

        descriptions.put(28,"Disco Elysium - The Final Cut is the definitive edition of the groundbreaking role playing game. You’re a detective with a unique skill system at your disposal and a whole city block to carve your path across. Interrogate unforgettable characters, crack murders, or take bribes. Become a hero or an absolute disaster of a human being.");

        descriptions.put(29,"Dishonored is an immersive first-person action game that casts you as a supernatural assassin driven by revenge. With Dishonored’s flexible combat system, creatively eliminate your targets as you combine the supernatural abilities, weapons and unusual gadgets at your disposal. Pursue your enemies under the cover of darkness or ruthlessly attack them head on with weapons drawn. The outcome of each mission plays out based on the choices you make.");

        descriptions.put(30,"Reprise your role as a supernatural assassin in Dishonored 2. Declared a “masterpiece” by Eurogamer and hailed “a must-play revenge tale” by Game Informer, Dishonored 2 is the follow up to Arkane’s 1st-person action blockbuster & winner of 100+ 'Game of the Year' awards, Dishonored.");

        descriptions.put(31,"The critically acclaimed RPG that raised the bar, from the creators of Baldur's Gate 3. Gather your party. Master deep, tactical combat. Venture as a party of up to four - but know that only one of you will have the chance to become a God.");

        descriptions.put(32,"\"Fight, Farm, Build and Explore Together in the standalone multiplayer expansion to the uncompromising wilderness survival game, Don't Starve. \n" +
                " \n" +
                " Enter a strange and unexplored world full of odd creatures, hidden dangers, and ancient secrets. Gather resources to craft items and build structures that match your survival style. Play your way as you unravel the mysteries of \"\"The Constant\"\". \n" +
                " \n" +
                " Cooperate with your friends in a private game, or find new friends online. Work with other players to survive the harsh environment, or strike out on your own. \n" +
                " \n" +
                " Do whatever it takes, but most importantly, Don't Starve.\"");

        descriptions.put(33,"When the sky opens up and rains down chaos, the world needs heroes. Become the savior of Thedas in Dragon Age: Inquisition – Game of the Year Edition. You are the Inquisitor, tasked with saving the world from itself. But the road ahead is paved with difficult decisions. Thedas is a land of strife. Factions constantly war with each other even as a larger demonic invasion has begun. And you? You and your band of champions are the only ones who can hold it together. It’s your job to lead them...or fall.");

        descriptions.put(34,"From the creators of hit titles Dead Island and Call of Juarez. Winner of over 50 industry awards and nominations. The game whose uncompromising approach to gameplay set new standards for first-person zombie games. Still supported with new content and free community events years after the release. Survive in a city beset by a zombie virus! Discover the hard choice you will have to make on your secret mission. Will loyalty to your superiors prove stronger than the will to save the survivors? The choice is yours…");

        descriptions.put(35,"\"Bethesda Game Studios, the award-winning creators of Fallout 3 and The Elder Scrolls V: Skyrim, welcome you to the world of Fallout 4 – their most ambitious game ever, and the next generation of open-world gaming. \n" +
                " \n" +
                " As the sole survivor of Vault 111, you enter a world destroyed by nuclear war. Every second is a fight for survival, and every choice is yours. Only you can rebuild and determine the fate of the Wasteland. Welcome home.\"");

        descriptions.put(36,"\"Far Cry comes to America in the latest installment of the award-winning franchise. \n" +
                " \n" +
                " Welcome to Hope County, Montana, land of the free and the brave but also home to a fanatical doomsday cult known as Eden’s Gate. Stand up to cult leader Joseph Seed, and his siblings, the Heralds, to spark the fires of resistance and liberate the besieged community.\"");

        descriptions.put(37,"\"Dive into a transformed vibrant post-apocalyptic Hope County, Montana, 17 years after a global nuclear catastrophe. \n" +
                " Join fellow survivors and lead the fight against the dangerous new threat the Highwaymen, and their ruthless leaders The Twins, as they seek to take over the last remaining resources.\"");

        descriptions.put(38,"\"The award-winning Far Cry franchise that stormed the tropics and the Himalayas now enters the original fight for humanity’s survival with its innovative open-world sandbox gameplay, bringing together massive beasts, breathtaking environments, and unpredictable savage encounters. \n" +
                " Welcome to the Stone Age, a time of extreme danger and limitless adventure, when giant mammoths and sabretooth tigers ruled the Earth and humanity is at the bottom of the food chain. As the last survivor of your hunting group, you will learn to craft a deadly arsenal, fend off fierce predators, and outsmart enemy tribes to conquer the land of Oros and become the Apex Predator.\"");

        descriptions.put(39,"No current Description");

        descriptions.put(40,"No current Description");

        descriptions.put(41,"No current Description");

        descriptions.put(42,"When a young street hustler, a retired bank robber and a terrifying psychopath land themselves in trouble, they must pull off a series of dangerous heists to survive in a city in which they can trust nobody, least of all each other.");

        descriptions.put(43,"Experiment and have fun in the ultimate playground as Agent 47 to become the master assassin. Travel around the globe to exotic locations and eliminate your targets with everything from a katana or a sniper rifle to an exploding golf ball or some expired spaghetti sauce.");

        descriptions.put(44,"Travel the globe and track your targets across exotic sandbox locations in HITMAN™ 2. From sun-drenched streets to dark and dangerous rainforests, nowhere is safe from the world’s most creative assassin, Agent 47 in the ultimate spy thriller story.");

        descriptions.put(45,"Death Awaits. Agent 47 returns in HITMAN 3, the dramatic conclusion to the World of Assassination trilogy.");

        descriptions.put(46,"Experience Aloy’s legendary quest to unravel the mysteries of a future Earth ruled by Machines. Use devastating tactical attacks against your prey and explore a majestic open world in this award-winning action RPG!");

        descriptions.put(47,"Just Cause 4 Reloaded delivers an expansive and explosive gameplay experience in an all-new package! Just Cause 4 Reloaded includes additional premium content as well as all previously released improvements and additions to the game. Jump into an action-packed open-world sandbox experience and cause chaos with a wide selection of weaponry, vehicles and gear. Strap into your wingsuit, equip your fully customizable grappling hook, and get ready to bring the thunder!");

        descriptions.put(48,"Thrust into a raging civil war, you watch helplessly as invaders storm your village and slaughter your family. Narrowly escaping the brutal attack, you grab your sword to fight back. Avenge the death of your parents and help repel the invading forces!");

        descriptions.put(49,"\"Part two of the Mafia crime saga – 1940’s - 50’s Empire Bay, NY \n" +
                " Remastered in HD, live the life of a gangster during the Golden-era of organized crime. War hero Vito Scaletta becomes entangled with the mob in hopes of paying his father’s debts.\"");

        descriptions.put(50,"\"Part three of the Mafia crime saga - 1968, New Bordeaux, LA.\n" +
                " After years of combat in Vietnam, Lincoln Clay knows this truth: family isn’t who you’re born with, it’s who you die for.\"");

        descriptions.put(51,"Metro Exodus is an epic, story-driven first person shooter from 4A Games that blends deadly combat and stealth with exploration and survival horror in one of the most immersive game worlds ever created.");

        descriptions.put(52,"Fight through Mordor and uncover the truth of the spirit that compels you, discover the origins of the Rings of Power, build your legend and ultimately confront the evil of Sauron in this new chronicle of Middle-earth.");

        descriptions.put(53,"Go behind enemy lines to forge your army, conquer Fortresses and dominate Mordor from within. Experience how the award winning Nemesis System creates unique personal stories with every enemy and follower, and confront the full power of the Dark Lord Sauron and his Ringwraiths in this epic new story of Middle-earth.");

        descriptions.put(54,"Welcome to a new world! Take on the role of a hunter and slay ferocious monsters in a living, breathing ecosystem where you can use the landscape and its diverse inhabitants to get the upper hand. Hunt alone or in co-op with up to three other players, and use materials collected from fallen foes to craft new gear and take on even bigger, badder beasts!");

        descriptions.put(55,"The horns sound, the ravens gather. An empire is torn by civil war. Beyond its borders, new kingdoms rise. Gird on your sword, don your armour, summon your followers and ride forth to win glory on the battlefields of Calradia.");

        descriptions.put(56,"No current Description");

        descriptions.put(57,"No current Description");

        descriptions.put(58,"NieR: Automata tells the story of androids 2B, 9S and A2 and their battle to reclaim the machine-driven dystopia overrun by powerful machines. Humanity has been driven from the Earth by mechanical beings from another world. In a final effort to take back the planet, the human resistance sends a force of android soldiers to destroy the invaders. Now, a war between machines and androids rages on... A war that could soon unveil a long-forgotten truth of the world.");

        descriptions.put(59,"Experience the thrill of taking on hordes of fearsome yokai in a battle to the death in this brutal masocore Action RPG. Create your own original protagonist and embark on an adventure that will take you through devastated locales across Japan during the Sengoku period.");

        descriptions.put(60,"No current Description");

        descriptions.put(61,"No current Description");

        descriptions.put(62,"No current Description");

        descriptions.put(63,"No current Description");

        descriptions.put(64,"No current Description");

        descriptions.put(65,"No current Description");

        descriptions.put(66,"No current Description");

        descriptions.put(67,"No current Description");

        descriptions.put(68,"No current Description");

        descriptions.put(69,"America, 1899. Arthur Morgan and the Van der Linde gang are outlaws on the run. With federal agents and the best bounty hunters in the nation massing on their heels, the gang must rob, steal and fight their way across the rugged heartland of America in order to survive. As deepening internal divisions threaten to tear the gang apart, Arthur must make a choice between his own ideals and loyalty to the gang who raised him");

        descriptions.put(70,"No current Description");

        descriptions.put(71,"No current Description");

        descriptions.put(72,"No current Description");

        descriptions.put(73,"No current Description");

        descriptions.put(74,"No current Description");

        descriptions.put(75,"No current Description");

        descriptions.put(76,"No current Description");

        descriptions.put(77,"This narratively-driven single player game puts you in the role of a Jedi Padawan who narrowly escaped the purge of Order 66 following the events of Episode 3: Revenge of the Sith. On a quest to rebuild the Jedi Order, you must pick up the pieces of your shattered past to complete your training, develop new powerful Force abilities, and master the art of the iconic lightsaber - all while staying one step ahead of the Empire and its deadly Inquisitors");

        descriptions.put(78,"No current Description");

        descriptions.put(79,"Winner of more than 200 Game of the Year Awards, Skyrim Special Edition brings the epic fantasy to life in stunning detail. The Special Edition includes the critically acclaimed game and add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic depth of field, screen-space reflections, and more. Skyrim Special Edition also brings the full power of mods to the PC and consoles. New quests, environments, characters, dialogue, armor, weapons and more – with Mods, there are no limits to what you can experience.");

        descriptions.put(80,"Lost in transit while on a colonist ship bound for the furthest edge of the galaxy, you awake decades later only to find yourself in the midst of a deep conspiracy threatening to destroy the Halcyon colony. As you explore the furthest reaches of space and encounter various factions, all vying for power, the character you decide to become will determine how this player-driven story unfolds. In the corporate equation for the colony, you are the unplanned variable.");

        descriptions.put(81,"No current Description");

        descriptions.put(82,"No current Description");

        descriptions.put(83,"No current Description");

        descriptions.put(84,"The cataclysmic conclusion to the Total War: WARHAMMER trilogy is coming. Rally your forces and step into the Realm of Chaos, a dimension of mind-bending horror where the very fate of the world will be decided. Will you conquer your Daemons… or command them?");

        descriptions.put(85,"\"In times of political turmoil and social unrest, the people are calling for visionary leaders, who will steer the fate of their country with foresight and ingenuity. \n" +
                " Prove yourself once again as a feared dictator or peace-loving statesman on the island state of Tropico and shape the fate of your very own banana republic through four distinctive eras. \n" +
                " Face new challenges on the international stage and always keep the needs of your people in mind.\"");

        descriptions.put(86,"No current Description");

        descriptions.put(87,"No current Description");

        descriptions.put(88,"No current Description");

        descriptions.put(89,"The virus won and civilization has fallen back to the Dark Ages. The City, one of the last human settlements, is on the brink of collapse. Use your agility and combat skills to survive, and reshape the world. Your choices matter.");

        descriptions.put(90,"A plague is ruining the land and the Tree-of-Life is bleeding death from its roots. The Tribes stand divided. Explore a world in turmoil and define its fate – will you be its saviour or lead it to an even darker destiny?");

        return descriptions;
    }

    private static Map<Integer, String> generateRsr() {
        Map<Integer, String> rsr =
                new LinkedHashMap<Integer, String>();
        rsr.put(1,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space");
        rsr.put(2,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(3,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(4,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(5,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(6,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(7,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(8,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(9,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(10,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(11,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(12,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(13,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(14,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(15,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(16,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(17,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(18,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(19,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(20,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(21,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(22,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(23,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(24,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(25,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(26,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(27,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(28,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(29,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(30,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(31,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(32,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(33,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(34,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(35,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(36,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(37,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(38,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(39,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(40,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(41,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(42,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(43,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(44,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(45,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(46,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(47,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(48,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(49,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(50,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(51,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(52,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(53,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(54,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(55,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(56,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(57,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(58,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(59,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(60,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(61,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(62,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(63,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space");
        rsr.put(64,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(65,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(66,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(67,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(68,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(69,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(70,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(71,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(72,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(73,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(74,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(75,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(76,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(77,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(78,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(79,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(80,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(81,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(82,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(83,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(84,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(85,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(86,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(87,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(88,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");
        rsr.put(89,"\t\u2022 CPU: i5-3440 \n\t\u2022 Memory: 8GB RAM \n\t\u2022 GPU: GTX 670 or Radeon R9 270X \n\t\u2022 Storage: 50GB Available Space\"");
        rsr.put(90,"\t\u2022 CPU: i7-4770K or Ryzen 5 1500X \n\t\u2022 Memory: 12GB RAM \n\t\u2022 GPU: GTX 1060 or RX 480 \n\t\u2022 Storage: 150GB Available Space");

        return rsr;
    }


    public static List<Game> getGames(){
        List<Game> gamesList = new ArrayList<Game>();
        Map<Integer, String> gamesName = generateGameTittles();
        Map<Integer, String> gamesPublisher = generateGamePublisher();
        Map<Integer, String> gamesDeveloper = generateDeveloper();
        Map<Integer, String> gamesCategory = generateGameCategory();
        Map<Integer, String> gamesRating = generateGameRating();
        Map<Integer, String> gamesPrice = generateGamePrice();
        Map<Integer, String> gamesDescription = generateGameDescription();
        Map<Integer, String> gamesRsr = generateRsr();


        for (Integer key : gamesName.keySet()){
            int gameID = key;
            String gameName = gamesName.get(key);
            String gamePublisher = gamesPublisher.get(key);
            String gameDeveloper = gamesDeveloper.get(key);
            String gamePrice = gamesPrice.get(key);
            String gameCategory = gamesCategory.get(key);
            String gameDescription = gamesDescription.get(key);
            String gameRsr = gamesRsr.get(key);
            String gameRating = gamesRating.get(key);
            String icon = "icon_game_"+String.valueOf(key);
            String header = "header_game_" + String.valueOf(key);

            Game n= new Game(gameID,gameName, gamePublisher, gameDeveloper,  gameCategory, gamePrice, gameRating, gameDescription, icon,header, gameRsr);

            gamesList.add(n);
        }
        return gamesList;
    }

    public static List<Game> getCardStuff(){
        List<Game> gamesList = new ArrayList<>();
        Map<Integer, String> gamesName = generateGameTittles();
        Map<Integer, String> gamesPublisher = generateGamePublisher();
        Map<Integer, String> gamesDeveloper = generateDeveloper();
        Map<Integer, String> gamesRating = generateGameRating();
        Map<Integer, String> gamesPrice = generateGamePrice();
        Map<Integer, String> gamesDescription = generateGameDescription();
        Map<Integer, String> gamesRsr = generateRsr();
        Game n;

        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i<11; i++){

            Random rand = new Random();
            int num = rand.nextInt(34);
            num += 1;

            while(temp.contains(num)){
                num = rand.nextInt(34);
                num += 1;
            }

            temp.add(num);

            String gameName = gamesName.get(num);
            String gamePublisher = gamesPublisher.get(num);
            String gameRating = gamesRating.get(num);
            String gameDeveloper = gamesDeveloper.get(num);
            String gamePrice = gamesPrice.get(num);
            String gameDescription = gamesDescription.get(num);
            String gameRsr = gamesRsr.get(num);

            String icon = "icon_game_"+String.valueOf(num);
            String header = "header_game_" + String.valueOf(num);

            n = new Game();
            n.setGameName(gameName);
            n.setGamePublisher(gamePublisher);
            n.setGameRating(gameRating);
            n.setGameDeveloper(gameDeveloper);
            n.setGamePrice(gamePrice);
            n.setGameDescription(gameDescription);
            n.setGameRsr(gameRsr);
            n.setIconFileName(icon);
            n.setHeaderFilename(header);

            gamesList.add(n);
        }

        return gamesList;
    }
    // Game Info End



    // Category Info Start
    public static List<Category> getMainCategories(){
        List<Category> categoryList;
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.category_shooter_icon, "FPS"));
        categoryList.add(new Category(2, R.drawable.category_fighting_icon, "Action"));
        categoryList.add(new Category(3, R.drawable.category_sports_icon, "Sports"));
        categoryList.add(new Category(4, R.drawable.category_puzzle_icon, "Strategy"));
        categoryList.add(new Category(5, R.drawable.category_racing_icon, "Racing"));

        return  categoryList;
    }
    // Category Info End

}
