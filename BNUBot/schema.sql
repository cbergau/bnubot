# Default values to insert

INSERT INTO rank (id, shortPrefix, prefix, verbstr, greeting, expireDays, apDays, apWins, apD2Level, apW3Level, apRecruitScore, apMail) VALUES
(-1, NULL, 'Shitlisted', 'is banlisted', '/ban %3$s', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(0, NULL, 'Guest', NULL, '/m %3$s Welcome to Clan BNU! If you''re a clan member, get a leader to add your account. For more information, you can visit our website at http://www.clanbnu.net/', 1, 2, NULL, NULL, NULL, NULL, NULL),
(1, NULL, 'Safelisted user', 'is safelisted', NULL, 90, NULL, NULL, NULL, NULL, NULL, NULL),
(2, NULL, 'Friend', 'is a friend of the clan', '/me waves to %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'God', 'The almighty', 'is a god', '/me bows before %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(10, 'Pvt', 'Private', NULL, 'Hello, %1$s. Your ping is %2$d.', 7, 1, 2, 5, 1, NULL, 'Congratulations on your first promotion! To see the requirements for your next, type ""%trigger%apinfo"" (note that you only need to meet one of the game requirements, not all three).'),
(11, 'Pvt', 'Private First Class', NULL, 'Hello, %1$s. Your ping is %2$d.', 15, 2, 5, 10, 3, NULL, 'Have you registered on our forums yet? Go to www.clanbnu.net and look for the link on the navigation bar.'),
(12, 'Cpl', 'Lance Corporal', NULL, 'Hello, %1$s. Your ping is %2$d.', 30, 3, 10, 20, 4, NULL, 'Are you registered on our forums yet? Go to http://www.clanbnu.net/ and look for the link in the navigation bar. We post news and other important clan information (such as tournaments) there, so be sure to check often!'),
(13, 'Cpl', 'Corporal', NULL, 'Hello, %1$s. Your ping is %2$d.', 60, 4, 15, 30, 5, NULL, 'Have you registered on our forums yet? Go to http://www.clanbnu.net/ and look for the link on the navigation bar.'),
(14, 'Sgt', 'Sergeant', NULL, 'Hello, %1$s. Your ping is %2$d.', 90, 5, 20, 40, 6, NULL, 'You''re now able to recruit! Find a member, bring them to the channel, and type "%trigger%recruit [username] [account]" -- they will need to have at least one win on their BNU- account, so play a game with them first. Good luck!'),
(15, 'Sgt', 'Staff Sergeant', NULL, 'Hello, %1$s. Your ping is %2$d.', 90, 6, 25, 50, 7, NULL, 'Don''t forget to recruit! Remember: find a member, bring them to the channel, and type "%trigger%recruit [username] [webaccount]" -- they need one win on their account first, so play a game with them before you recruit. Good luck!'),
(16, 'Sgt', 'Gunnery Sergeant', NULL, '/me greets %1$s with ping %2$d', 90, 7, 30, 52, 7, NULL, 'Did you know that you need to recruit in order to get promotions past rank 17? To recruit, find a member and bring them to the channel. Then, type "%trigger%recruit [username] [webaccount]" -- Good luck!'),
(17, 'Sgt', 'Master Sergeant', NULL, '/me greets %1$s with ping %2$d', 90, 7, 35, 55, 8, 1, 'Great job getting recruits! Keep it up, and you''ll be well on your way to being a well known and respected part of BNU!'),
(18, 'Sgt', 'First Sergeant', NULL, '/me greets %1$s with ping %2$d', 90, 7, 40, 57, 8, 2, NULL),
(19, 'Sgt', 'Master Gunnery Sergeant', NULL, '/me greets %1$s with ping %2$d', 90, 7, 45, 62, 9, 3, NULL),
(20, 'Sgt', 'Sergeant Major', NULL, '/me greets %1$s with ping %2$d', 90, 7, 50, 67, 9, 4, NULL),
(21, 'WO1', 'Warrant Officer 1', NULL, '/me welcomes %1$s with ping %2$d', 90, 14, 55, 72, 10, 5, NULL),
(22, 'WO2', 'Warrant Officer 2', NULL, '/me welcomes %1$s with ping %2$d', 90, 14, 60, 75, 10, 6, NULL),
(23, 'WO3', 'Warrant Officer 3', NULL, '/me welcomes %1$s with ping %2$d', 90, 14, 65, 78, 11, 7, NULL),
(24, 'WO4', 'Warrant Officer 4', NULL, '/me welcomes %1$s with ping %2$d', 90, 14, 70, 80, 11, 8, NULL),
(25, 'WO5', 'Warrant Officer 5', NULL, '/me welcomes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(26, 'Lt', 'Second Lieutenant', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(27, 'Lt', 'First Lieutenant', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(28, 'Cpt', 'Captain', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(29, 'Mjr', 'Major', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(30, 'Col', 'Lieutenant Colonel', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(31, 'Col', 'Colonel', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(32, 'Gen', 'Brigadier General', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(33, 'Gen', 'Major General', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(34, 'Gen', 'Lieutenant General', NULL, '/me salutes %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(35, 'Gen', 'General', NULL, '/me hails %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL),
(36, NULL, 'Master', 'is my master', '/me hails %1$s with ping %2$d', 90, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO command (access, name, description, cmdgroup) VALUES
(1,		'access', 'Get the commands avalible to the user', 'commands'),
(34,	'add', 'Set access', 'accounts'),
(35,	'addalias', NULL, 'administration'),
(10,	'allseen', NULL, 'info'),
(1,		'auth', 'Get the authorization required to use a command', 'info'),
(1,		'autopromotion', 'Get the AP info for an account', 'info'),
(35,	'ban', NULL, 'moderation'),
(35,	'clearqueue', NULL, 'administration'),
(34,	'createaccount', NULL, 'accounts'),
(34,	'demote', NULL, 'accounts'),
(36,	'disconnect', NULL, 'administration'),
(35,	'home', NULL, 'administration'),
(1,		'info', 'Bot version', 'info'),
(30,	'invite', NULL, 'clan'),
(34,	'kick', NULL, 'moderation'),
(32,	'lockdown', NULL, 'moderation'),
(1,		'mail', NULL, 'accounts'),
(30,	'mailall', NULL, 'accounts'),
(1,		'ping', NULL, 'info'),
(1,		'pingme', NULL, 'info'),
(34,	'promote', NULL, 'accounts'),
(36,	'quit', 'Close program', 'administration'),
(36,	'reconnect', NULL, 'administration'),
(15,	'recruit', NULL, 'accounts'),
(10,	'recruits', NULL, 'info'),
(35,	'rejoin', NULL, 'administration'),
(34,	'renameaccount', NULL, 'accounts'),
(36,	'say', NULL, 'administration'),
(1,		'search', 'Search for users by pattern', 'info'),
(1,		'searchrank', 'Search for accounts by rank', 'info'),
(1,		'seen', NULL, 'info'),
(34,	'setaccount', NULL, 'accounts'),
(36,	'setauth', NULL, 'administration'),
(1,		'setbirthday', NULL, 'accounts'),
(35,	'setrank', NULL, 'clan'),
(35,	'setrecruiter', NULL, 'accounts'),
(34,	'sweepban', NULL, 'moderation'),
(35,	'timeban', NULL, 'moderation'),
(1,		'trigger', 'Current trigger', 'info'),
(1,		'trivia', NULL, 'trivia'),
(34,	'unban', NULL, 'moderation'),
(34,	'update', NULL, 'administration'),
(1,		'vote', 'cast a vote', 'moderation'),
(20,	'voteban', 'vote to ban', 'moderation'),
(20,	'votecancel', 'cancel a vote', 'moderation'),
(15,	'votekick', 'vote to kick', 'moderation'),
(35,	'whisperback', 'Toggle whisperback on/off', 'administration'),
(1,		'whoami', NULL, 'info'),
(1,		'whois', NULL, 'info');

INSERT INTO command_alias (alias, name) VALUES
('commands', 'access'),
('help', 'access'),
('aa', 'addalias'),
('ap', 'autopromotion'),
('apinfo', 'autopromotion'),
('shutup', 'clearqueue'),
('cq', 'clearqueue'),
('ca', 'createaccount'),
('ver', 'info'),
('version', 'info'),
('rc', 'reconnect'),
('ra', 'renameaccount'),
('rj', 'rejoin'),
('sa', 'setaccount'),
('sr', 'setrecruiter'),
('sweep', 'sweepban');
