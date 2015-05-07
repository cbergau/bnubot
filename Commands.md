## About ##
Prefix the command name with your trigger. If you're doing the command locally (from within the bot), you can use / as long as it doesn't conflict with a battle.net command (ex: /whois will always do a battle.net whois).

## Arguments Legend ##
| **Argument** | **Meaning** |
|:-------------|:------------|
| `text` | Literal text |
| `<argument>` | Required argument |
| `[argument]` | Optional argument |

## Special Arguments ##
| **Argument** | **Meaning** |
|:-------------|:------------|
| `<user>` | A Battle.net login |
| `<account>` | A BNU-Bot database account |

# Commands #

## useful ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| trigger | `none` | 1 | called with ?trigger |
| search | `<pattern>` | 1 | Search for users matching a pattern |
| searchrank | `<minimum access> [maximum access]` | 1 | Search for Accounts with certain access |

## accounts ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| whoami |  | 1 |  |
| whois | `<user>` | 1 |  |
| seen| `<account>` | 1 |  |
| mail | `read [number]` | 1 | Reads any unread mail |
| mail | `clear` | 1 | Delete read mail |
| mail | `send <account> <message>` | 1 | Send mail to a user |
| setbirthday | `<MM/DD/YY>` | 1 | Set your birth date |
| autopromotion | `[account]` | 1 | Shows autopromotion status for an account |
| recruit | `<user> <account>` | 15 | The user must have been seen by the bot |
| recruits | `[account]` | 10 | Shows the account's recruits |
| mailall | `<minimum access> <message>` | 30 | Sends mail to everyone of access <minimum access> and higher |
| setaccount | `<user> <account>` | 34 | Adds 

&lt;user&gt;

 to 

&lt;account&gt;

 |
| renameaccount | `<oldaccount> <newaccount>` | 34 | Renames an account |
| createaccount | `<account>` | 34 |  |
| add | `<account> <access>` | 34 |  |
| promote| `<account>` | 34 |  |
| demote | `<account>` | 34 |  |
| setrecruiter | `<account (recruited)> <account (recruiter)>` | 35 |  |

## administration ##
| **Command** | **Arguments** | **Access Required** |
|:------------|:--------------|:--------------------|
| reconnect |  | 36 |
| say | `<message>` | 36 |
| quit |  | 36 |
| disconnect |  | 36 |

## clan ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| setrank | `<user> <rank>` | 35 | Access can be one of peon, grunt, shaman, or 1, 2, or 3 |
| invite | `<user>` | 30 | Invite a user in to the clan (requires shaman) |

## commands ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| auth | `<command>` | 1 | Get the access requirement to use the given command |
| access | `[category]` | 1 | List available commands |
| setauth | `<command> <access>` | 36 | Set the authorization required to use a command |

## info ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| allseen |  | 10 | View the last 10 active users |
| info |  | 1 | Get the bot version and Operating System version and architecture |

## moderation ##
| **Command** | **Arguments** | **Access Required** | **Comment** |
|:------------|:--------------|:--------------------|:------------|
| sweepban | `<channel>` | 34 | Bans all users in 

&lt;channel&gt;

 |
| unban | `<user>` | 34 |  |
| kick | `<user> [reason]` | 34 | Accepts wildcards! |
| ban | `<user> [reason]` | 35 | Accepts wildcards! |
| votekick | `<user>` | 15 | Vote to kick a user |
| voteban | `<user>` | 15 | Vote to ban a user |
| votecancel |  | 15 | Cancel a vote |