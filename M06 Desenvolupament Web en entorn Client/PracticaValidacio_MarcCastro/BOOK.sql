
--
-- Estructura de la taula `BOOK`
--

CREATE TABLE `BOOK` (
  `id` int(10) NOT NULL,
  `cover` varchar(200) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `author` varchar(200) NOT NULL,
  `summary` varchar(2000) DEFAULT NULL,
  `likes` int(10) DEFAULT 0,
  `dislikes` int(10) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Bolcament de dades per a la taula `BOOK`
--

INSERT INTO `BOOK` (`id`, `cover`, `title`, `author`, `summary`, `likes`, `dislikes`) VALUES
(1, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1618329605l/56597885.jpg', 'Beautiful World, Where Are You', 'Sally Rooney', 'Irish author Sally Rooney wins this year’s Best Fiction award for her celebrated novel on the complexities of romance, sex, and friendship on our swiftly tilting planet. A kind of deep-focus love quadrangle story, the book clearly hit a nerve for readers. This is the second GCA nomination for Rooney—she came in second for her 2018 novel, Normal People.', 24, 8),
(2, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1597695864l/54493401.jpg', 'Project Hail Mary', 'Andy Weir', 'Engineer-turned-novelist Andy Weir is on a crazy run. Best career switch ever? Project Hail Mary—concerning a resourceful astronaut and an extinction-level event—is Weir’s third nomination…and his third win. As with his previous books The Martian and Artemis, Project Hail Mary is final evidence that old-school hard science fiction is back. Quantum physics! Chemistry! Exobiology! Aerodynamics! It actually is rocket science.', 15, 6),
(3, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1474154022l/3._SY475_.jpg', 'Harry Potter and the Sorcerer\'s Stone', 'J.K. Rowling', 'Harry Potter\'s life is miserable. His parents are dead and he\'s stuck with his heartless relatives, who force him to live in a tiny closet under the stairs. But his fortune changes when he receives a letter that tells him the truth about himself: he\'s a wizard. A mysterious visitor rescues him from his relatives and takes him to his new home, Hogwarts School of Witchcraft and Wizardry.\r\n', 1, 1),
(4, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1586722975l/2767052.jpg', 'The Hunger Games', 'Suzanne Collins', 'In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV.', 1, 0),
(5, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1432730315l/256683._SY475_.jpg', 'City of Bones', 'Cassandra Clare ', 'When fifteen-year-old Clary Fray heads out to the Pandemonium Club in New York City, she hardly expects to witness a murder― much less a murder committed by three teenagers covered with strange tattoos and brandishing bizarre weapons. Then the body disappears into thin air. It\'s hard to call the police when the murderers are invisible to everyone else and when there is nothing―not even a smear of blood―to show that a boy has died. Or was he a boy?\r\n', 1, 0),
(6, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1618526890l/13335037._SY475_.jpg', 'Divergent', 'Veronica Roth ', 'In Beatrice Prior\'s dystopian Chicago world, society is divided into five factions, each dedicated to the cultivation of a particular virtue—Candor (the honest), Abnegation (the selfless), Dauntless (the brave), Amity (the peaceful), and Erudite (the intelligent). On an appointed day of every year, all sixteen-year-olds must select the faction to which they will devote the rest of their lives. For Beatrice, the decision is between staying with her family and being who she really is—she can\'t have both. So she makes a choice that surprises everyone, including herself.', 1, 0),
(7, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1546071216l/5907.jpg', 'The Hobbit, or There and Back Again', 'J.R.R. Tolkien', 'In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means comfort.\r\nWritten for J.R.R. Tolkien’s own children, The Hobbit met with instant critical acclaim when it was first published in 1937. Now recognized as a timeless classic, this introduction to the hobbit Bilbo Baggins, the wizard Gandalf, Gollum, and the spectacular world of Middle-earth recounts of the adventures of a reluctant hero, a powerful and dangerous ring, and the cruel dragon Smaug the Magnificent. The text in this 372-page paperback edition is based on that first published in Great Britain by Collins Modern Classics (1998), and includes a note on the text by Douglas A. Anderson (2001).', 0, 0),
(8, 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1367545443l/157993.jpg', 'The Little Prince', 'Antoine de Saint-Exupéry', 'A pilot stranded in the desert awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the stranger, \"draw me a sheep.\" And the pilot realizes that when life\'s events are too difficult to understand, there is no choice but to succumb to their mysteries. He pulls out pencil and paper... And thus begins this wise and enchanting fable that, in teaching the secret of what is really important in life, has changed forever the world for its readers.', 0, 0);

--
-- Índexs per a les taules bolcades
--

--
-- Índexs per a la taula `BOOK`
--
ALTER TABLE `BOOK`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per les taules bolcades
--

--
-- AUTO_INCREMENT per la taula `BOOK`
--
ALTER TABLE `BOOK`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;
