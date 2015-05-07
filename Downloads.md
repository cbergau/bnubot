﻿#summary How to download and install BNU-Bot
#labels Featured,Phase-Deploy


# Read the instructions fully before asking questions! #
The majority of the questions people ask after installing the bot are already answered here, so save yourself the embarrassment and read the whole thing before asking!


# What do I need? #
## Java Runtime Environment ##
If you don't already have a JRE (Java Runtime Environment) version 1.5 or newer, download one from Sun's website: http://java.sun.com/javase/downloads/index.jsp. Note that the JDK appears above the JRE; you do not need the larger JDK package.

If you have already have a compatible JDK (Java Development Kit) installed, you may skip this step.

Mac users: You must have OSX 10.4 (Tiger) or newer. If you are using an older version of OSX, you can't run Java 5 programs. There are no plans to add support in the future.

## The BNU-Bot installer ##
Download the BNU-Bot installer: http://bnubot.googlecode.com/files/BNUBot-Install-v6.jar


# What to do with it #
## Launch the installer ##
Double-click on the JAR. Alternatively, you can type `java -jar BNUBot-Install-v5.jar` from a terminal window. Add --help for command-line options.

## Select a location to install BNU-Bot ##
The installer will download all of the required files, and place them in the folder you select. This may be confusing to OSX users, as the installer will create an Application one directory deeper than one might expect.


# Launch the bot! #
The Installer will prompt you to launch BNU-Bot automatically when it is finished installing. For future reference, you can launch the bot by doing the following:

## Windows ##
Double-click on BNUBot.exe in the folder where you installed BNU-Bot.

## OSX ##
Double-click on the BNUBot Application.

## Linux ##
Double-click on run.sh, or run `./run.sh` from the console in the directory where you installed BNU-Bot.


# Get support #
## Use the forums! ##
Do not try to contact Camel directly; he'll just tell you to go to the forums. Your question will get more visibility there, and you'll get a quicker response. http://forums.clanbnu.net/index.php?board=23.0.

## Can I use Starcraft or Warcraft3? ##
The short answer is yet, but you must follow some extra steps. You can find more information on the forums: http://forums.clanbnu.net/index.php/topic,681.0.html.

## Help with commands ##
There is a wiki page documenting the available commands in BNU-Bot: [Commands](Commands.md)

## Help with trivia ##
There is a wiki page documenting how to use trivia in BNU-Bot: [Trivia](Trivia.md)

## Ask questions ##
There is a support forum for BNU-Bot on clanbnu.net's forums: http://forums.clanbnu.net/index.php?board=23.0. Please be sure to check the recent topics to see if your question has already been answered, since most issues pop up there shortly after being discovered.

## Report a bug ##
If you experience a bug, please consult the support forum before reporting an issue. It's very likely that someone else has had the same problem, and there is already a known solution.

If you are confident that you are reporting a new issue, visit the issue tracker on this website, and file a new issue: http://code.google.com/p/bnubot/issues/list. Please include a complete stack trace, which you can find in log.txt, if applicable. A stack trace looks like this:
```
java.lang.Exception: java.lang.NoClassDefFoundError: org/eclipse/swt/graphics/ImageData
	at net.bnubot.bot.gui.icons.IconsDotBniReader.readIconsDotBni(IconsDotBniReader.java:369)
	at net.bnubot.bot.gui.icons.IconsDotBniReader.initialize(IconsDotBniReader.java:131)
	at net.bnubot.settings.ConnectionSettings.<init>(ConnectionSettings.java:48)
	at net.bnubot.core.Profile.newConnection(Profile.java:165)
	at net.bnubot.Main.main(Main.java:114)
Caused by: java.lang.NoClassDefFoundError: org/eclipse/swt/graphics/ImageData
	at net.bnubot.bot.gui.icons.IconsDotBniReader.readIconsDotBni(IconsDotBniReader.java:360)
	... 4 more
```
In this case, the exception was caused by a missing SWT dependency, which is okay since this particular exception is handled properly, and is only displayed as a reminder that the feature is incomplete.

## Request new features ##
You may request new features by filing an issue on this website: http://code.google.com/p/bnubot/issues/list. Please search before you report a new issue to be sure that there is not already a similar issue. You can show that you want a particular feature by starring that issue. If you would like a more elaborate solution than what is described in the original issue, you may add comments.