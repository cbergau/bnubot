

## Enabling Trivia ##
Enable the TriviaEventHandler in the Settings window.

## Locate the trivia folder ##
### OSX ###
Locate the **BNUBot** application. Option+click on it, and select **Show Package Contents** from the dropdown list. If there is no folder named **trivia**, you may create it.
### All other OSes ###
Locate the folder containing **BNUBot.jar**. If there is no folder named **trivia**, you may create it.

## Adding trivia files ##
Place the trivia files in the trivia folder. The bot accepts trivia in the following formats:

  * `/<category>/<answer>/<answer>//<question>`
  * `<Question>*<answer>*<answer2>*...`
  * `Scramble*<word>`

## Enabling trivia ##
Simply type "!trivia on" where ! is your trigger.
To turn it off, type "!trivia off".
To view the leaderboard, type "!trivia score".