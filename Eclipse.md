

# Installing and configuring Eclipse for BNU-Bot 2.0 #
## Get Java ##
If you don't already have the JRE (1.5 or later), get it from Sun's website.
## Getting started with Eclipse ##
### Download Eclipse ###
Visit http://www.eclipse.org/downloads/.
The package "Eclipse IDE for Java Developers" is all you need. There are larger packages that include more plugins, but none of these are required for BNU-Bot.
### Install Eclipse ###
  * Windows: Unzip the file you just downloaded to your Program Files directory, or anywhere that you want to keep it.
  * OSX: Drag the Eclipse application to your Applications folder.
  * Linux: Installation varies from distribution to distribution; seek instructions from your distribution's website, or from the Eclipse.org website.
### Launch Eclipse ###
Launch Eclipse. It will take a few moments to load. It will ask you for a directory to store your workspace. This is where all of the BNU-Bot and JBLS source code, compiled bytecode, libraries, and settings files will reside. I strongly recommend using the default path. When Eclipse is done loading, close the welcome window.
## Configuring Eclipse for Subversion ##
### Configure the update site ###
  * Click on the **Help** menu, and navigate to **Software Updates**, and then **Find and Install...**.
  * Select **Search for new features to install**, and click **Next**.
  * Click **New Remote Site**.
  * For **Name**, enter "Subclipse"
  * For **URL**, enter "http://subclipse.tigris.org/update_1.2.x"
  * Click **OK**, and make sure the box next to "Subclipse" is checked.
  * Click **Finish**.
### Installing the Subclipse plugin ###
  * Select the desired features; the features below Integrations are not required.
  * Click **Finish** and wait for the update to complete.
  * Restart Eclipse.
## Check out BNU-Bot source code from SVN ##
### Create the BNU-Bot project in Eclipse ###
  * Click on the **File** menu, and navigate to **New**, and then **Project...**.
  * Expand **SVN**, and click **Checkout Projects from SVN**, and then click **Next**.
  * Click **Create a new repository location**, and then **Next**.
  * Enter _http://bnubot.googlecode.com/svn_ for the **URL**, and click **Next**.
  * Expand **trunk**, and click on **BNUBot**, then click **Finish**.
## Launch BNU-Bot ##
  * Expand **BNUBot**/**src**/**bnubot** in the **Package Explorer** view of Eclipse.
  * Right click on **Main.java**, and then **Run As**, followed by **Java Application**.
  * The bot will start up, and the configuration window will appear.
  * You will need to fill in the cdkeys.txt file before you can select CD keys from the drop down menu.
## Updating checked out source code ##
  * Right click on the **BNUBot** project, then click **Team** and **Update**.

# Contributing: patches #
## Create a patch ##
  * Right click on the **BNUBot** project, then click **Team** and **Create Patch...**.
  * Select **Save In File System**, and click **Browse** to select a location to save the patch.
  * Verify that only the desired files are included in the **Changes** section.
  * Click **Finish**.
## Submitting the patch ##
  * Go to the issue tracker at http://www.bnubot.net/ and click **New Issue**.
  * Attach the patch file to the issue, and fill out the summary and description fields.