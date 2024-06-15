REALM DB CONSUMIENDO PELÍCULAS

DESCRIPCIÓN: Utilizar un servicio de internet por medio de RETROFIT para descargar set de películas las cuales, luego se almacenarán en una base de datos REALM en el dispositivo. 

Se mostrarán al usuario utilizando CardView que se cargarán en el RECICLERVIEW.

Los datos utilizados para el acceso al servicio son los siguientes:

    var baseURL = "https://api.themoviedb.org/"

    @GET("3/movie/popular")
    fun getMovies(@Header("Authorization") authHeader: String,
                  @Query("api_key") apiKey: String): Call<MoviesResponse>

    var accessToken = "bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhY2U4MDBkZWQwYzE2MjdhMzgyMjgyYWYyZWEzZDMwNSIsInN1YiI6IjY2MjAzZmMxMjBhZjc3MDE3ZDNmYjNmYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.yz5GnmAXBy1v0mh3EejPuO3R3q3raPut6awhc4PAv7s"

    var apiKey = "ace800ded0c1627a382282af2ea3d305"

![image](https://github.com/aportillo16/MoviesWithRealmDB/assets/166572036/3e056873-8299-41b3-a763-000c879fa289)


JSON RESULT:
    
    {
    "page": 1,
    "results": [
        {
            "adult": false,
            "backdrop_path": "/fqv8v6AycXKsivp1T5yKtLbGXce.jpg",
            "genre_ids": [
                878,
                12,
                28
            ],
            "id": 653346,
            "original_language": "en",
            "original_title": "Kingdom of the Planet of the Apes",
            "overview": "Several generations in the future following Caesar's reign, apes are now the dominant species and live harmoniously while humans have been reduced to living in the shadows. As a new tyrannical ape leader builds his empire, one young ape undertakes a harrowing journey that will cause him to question all that he has known about the past and to make choices that will define a future for apes and humans alike.",
            "popularity": 3461.208,
            "poster_path": "/gKkl37BQuKTanygYQG1pyYgLVgf.jpg",
            "release_date": "2024-05-08",
            "title": "Kingdom of the Planet of the Apes",
            "video": false,
            "vote_average": 6.815,
            "vote_count": 1032
        },
        {
            "adult": false,
            "backdrop_path": "/gRApXuxWmO2forYTuTmcz5RaNUV.jpg",
            "genre_ids": [
                28,
                80,
                53,
                35
            ],
            "id": 573435,
            "original_language": "en",
            "original_title": "Bad Boys: Ride or Die",
            "overview": "After their late former Captain is framed, Lowrey and Burnett try to clear his name, only to end up on the run themselves.",
            "popularity": 2592.584,
            "poster_path": "/nP6RliHjxsz4irTKsxe8FRhKZYl.jpg",
            "release_date": "2024-06-05",
            "title": "Bad Boys: Ride or Die",
            "video": false,
            "vote_average": 7.0,
            "vote_count": 248
        },
        {
            "adult": false,
            "backdrop_path": "/stKGOm8UyhuLPR9sZLjs5AkmncA.jpg",
            "genre_ids": [
                16,
                10751,
                18,
                12,
                35
            ],
            "id": 1022789,
            "original_language": "en",
            "original_title": "Inside Out 2",
            "overview": "Teenager Riley's mind headquarters is undergoing a sudden demolition to make room for something entirely unexpected: new Emotions! Joy, Sadness, Anger, Fear and Disgust, who’ve long been running a successful operation by all accounts, aren’t sure how to feel when Anxiety shows up. And it looks like she’s not alone.",
            "popularity": 3553.5,
            "poster_path": "/vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg",
            "release_date": "2024-06-11",
            "title": "Inside Out 2",
            "video": false,
            "vote_average": 7.4,
            "vote_count": 93
        },
        {
            "adult": false,
            "backdrop_path": "/hliXekHv7xc2cgXnMBLlp4Eihq8.jpg",
            "genre_ids": [
                53,
                27,
                28,
                9648
            ],
            "id": 1001311,
            "original_language": "fr",
            "original_title": "Sous la Seine",
            "overview": "In the Summer of 2024, Paris is hosting the World Triathlon Championships on the Seine for the first time. Sophia, a brilliant scientist, learns from Mika, a young environmental activist, that a large shark is swimming deep in the river. To avoid a bloodbath at the heart of the city, they have no choice but to join forces with Adil, the Seine river police commander.",
            "popularity": 2342.816,
            "poster_path": "/qZPLK5ktRKa3CL4sKRZtj8UlPYc.jpg",
            "release_date": "2024-06-05",
            "title": "Under Paris",
            "video": false,
            "vote_average": 5.779,
            "vote_count": 428
        },
        {
            "adult": false,
            "backdrop_path": "/veIyxxi5Gs8gvztLEW1Ysb8rrzs.jpg",
            "genre_ids": [
                878,
                28,
                12
            ],
            "id": 823464,
            "original_language": "en",
            "original_title": "Godzilla x Kong: The New Empire",
            "overview": "Following their explosive showdown, Godzilla and Kong must reunite against a colossal undiscovered threat hidden within our world, challenging their very existence – and our own.",
            "popularity": 1588.863,
            "poster_path": "/z1p34vh7dEOnLDmyCrlUVLuoDzd.jpg",
            "release_date": "2024-03-27",
            "title": "Godzilla x Kong: The New Empire",
            "video": false,
            "vote_average": 7.219,
            "vote_count": 2734
        },
        {
            "adult": false,
            "backdrop_path": "/vblTCXOWUQGSc837vgbhDRi4HSc.jpg",
            "genre_ids": [
                28,
                80,
                35,
                53
            ],
            "id": 955555,
            "original_language": "ko",
            "original_title": "범죄도시3",
            "overview": "Detective Ma Seok-do changes his affiliation from the Geumcheon Police Station to the Metropolitan Investigation Team, in order to eradicate Japanese gangsters who enter Korea to commit heinous crimes.",
            "popularity": 1474.333,
            "poster_path": "/lW6IHrtaATxDKYVYoQGU5sh0OVm.jpg",
            "release_date": "2023-05-31",
            "title": "The Roundup: No Way Out",
            "video": false,
            "vote_average": 7.02,
            "vote_count": 254
        },
        {
            "adult": false,
            "backdrop_path": "/z121dSTR7PY9KxKuvwiIFSYW8cf.jpg",
            "genre_ids": [
                10752,
                28,
                18
            ],
            "id": 929590,
            "original_language": "en",
            "original_title": "Civil War",
            "overview": "In the near future, a group of war journalists attempt to survive while reporting the truth as the United States stands on the brink of civil war.",
            "popularity": 1440.415,
            "poster_path": "/sh7Rg8Er3tFcN9BpKIPOMvALgZd.jpg",
            "release_date": "2024-04-10",
            "title": "Civil War",
            "video": false,
            "vote_average": 7.014,
            "vote_count": 1512
        },
        {
            "adult": false,
            "backdrop_path": "/kZbTOcTrEGyroQMWQSGIRlNSkwP.jpg",
            "genre_ids": [
                878,
                28,
                14,
                12
            ],
            "id": 626412,
            "original_language": "ko",
            "original_title": "외계+인 2부",
            "overview": "Ean has a critical mission to return to the future to save everyone. However, she becomes trapped in the distant past while trying to prevent the escape of alien prisoners who are locked up in the bodies of humans. Meanwhile, Muruk, who helps Ean escape various predicaments, is unnerved when he begins sensing the presence of a strange being in his body. Traveling through the centuries, they are trying to prevent the explosion of the haava.",
            "popularity": 1125.679,
            "poster_path": "/4RClncz0GTKPZzSAcAalHCw0h3g.jpg",
            "release_date": "2024-01-10",
            "title": "Alienoid: Return to the Future",
            "video": false,
            "vote_average": 6.612,
            "vote_count": 214
        },
        {
            "adult": false,
            "backdrop_path": "/oavbmL3iddJUmC8nQjL6bLHwAP4.jpg",
            "genre_ids": [
                27,
                53
            ],
            "id": 719221,
            "original_language": "en",
            "original_title": "Tarot",
            "overview": "When a group of friends recklessly violate the sacred rule of Tarot readings, they unknowingly unleash an unspeakable evil trapped within the cursed cards. One by one, they come face to face with fate and end up in a race against death.",
            "popularity": 1107.373,
            "poster_path": "/gAEUXC37vl1SnM7PXsHTF23I2vq.jpg",
            "release_date": "2024-05-01",
            "title": "Tarot",
            "video": false,
            "vote_average": 6.473,
            "vote_count": 464
        },
        {
            "adult": false,
            "backdrop_path": "/j29ekbcLpBvxnGk6LjdTc2EI5SA.jpg",
            "genre_ids": [
                16,
                10751,
                12,
                18,
                35
            ],
            "id": 150540,
            "original_language": "en",
            "original_title": "Inside Out",
            "overview": "From an adventurous balloon ride above the clouds to a monster-filled metropolis, Academy Award®-winning director Pete Docter (“Monsters, Inc.,” “Up”) has taken audiences to unique and imaginative places. In Disney and Pixar’s original movie “ Inside Out,” he will take us to the most extraordinary location of all—inside the mind.",
            "popularity": 1092.832,
            "poster_path": "/2H1TmgdfNtsKlU9jKdeNyYL5y8T.jpg",
            "release_date": "2015-06-17",
            "title": "Inside Out",
            "video": false,
            "vote_average": 7.915,
            "vote_count": 20513
        },
        {
            "adult": false,
            "backdrop_path": "/nv6F6tz7r61DUhE7zgHwLJFcTYp.jpg",
            "genre_ids": [
                10749,
                35,
                80
            ],
            "id": 974635,
            "original_language": "en",
            "original_title": "Hit Man",
            "overview": "A mild-mannered professor moonlighting as a fake hit man in police stings ignites a chain reaction of trouble when he falls for a potential client.",
            "popularity": 1063.018,
            "poster_path": "/5BfcYFhRVlgWLFo4SCkQNsIWzyy.jpg",
            "release_date": "2024-05-16",
            "title": "Hit Man",
            "video": false,
            "vote_average": 6.961,
            "vote_count": 246
        },
        {
            "adult": false,
            "backdrop_path": "/3TNSoa0UHGEzEz5ndXGjJVKo8RJ.jpg",
            "genre_ids": [
                878,
                28
            ],
            "id": 614933,
            "original_language": "en",
            "original_title": "Atlas",
            "overview": "A brilliant counterterrorism analyst with a deep distrust of AI discovers it might be her only hope when a mission to capture a renegade robot goes awry.",
            "popularity": 1048.81,
            "poster_path": "/bcM2Tl5HlsvPBnL8DKP9Ie6vU4r.jpg",
            "release_date": "2024-05-23",
            "title": "Atlas",
            "video": false,
            "vote_average": 6.735,
            "vote_count": 735
        },
        {
            "adult": false,
            "backdrop_path": "/H5HjE7Xb9N09rbWn1zBfxgI8uz.jpg",
            "genre_ids": [
                28,
                35
            ],
            "id": 746036,
            "original_language": "en",
            "original_title": "The Fall Guy",
            "overview": "Fresh off an almost career-ending accident, stuntman Colt Seavers has to track down a missing movie star, solve a conspiracy and try to win back the love of his life while still doing his day job.",
            "popularity": 817.239,
            "poster_path": "/aBkqu7EddWK7qmY4grL4I6edx2h.jpg",
            "release_date": "2024-04-24",
            "title": "The Fall Guy",
            "video": false,
            "vote_average": 7.261,
            "vote_count": 1211
        },
        {
            "adult": false,
            "backdrop_path": "/eAIHqfS3kXm7kZl4j7ZBfdegyEz.jpg",
            "genre_ids": [
                53,
                28,
                80
            ],
            "id": 38700,
            "original_language": "en",
            "original_title": "Bad Boys for Life",
            "overview": "Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel.",
            "popularity": 779.566,
            "poster_path": "/y95lQLnuNKdPAzw9F9Ab8kJ80c3.jpg",
            "release_date": "2020-01-15",
            "title": "Bad Boys for Life",
            "video": false,
            "vote_average": 7.124,
            "vote_count": 7876
        },
        {
            "adult": false,
            "backdrop_path": "/k9X79JC2dDTcSpxuKJ3p2Teq3oZ.jpg",
            "genre_ids": [
                878,
                28,
                12
            ],
            "id": 1025463,
            "original_language": "pt",
            "original_title": "Biônicos",
            "overview": "When the progress of robotics makes Paralympic athletes the new sports stars, Maria dreams of competing against her sister. For that, she will have to enter a world of crime and violence.",
            "popularity": 743.097,
            "poster_path": "/xVCYzdBE6lo3sUFK1OMZnXvpGtT.jpg",
            "release_date": "2024-05-28",
            "title": "Bionic",
            "video": false,
            "vote_average": 5.402,
            "vote_count": 66
        },
        {
            "adult": false,
            "backdrop_path": "/7v4gev91nO3i66Zzygh9jplu9UI.jpg",
            "genre_ids": [
                28,
                12,
                878
            ],
            "id": 786892,
            "original_language": "en",
            "original_title": "Furiosa: A Mad Max Saga",
            "overview": "As the world fell, young Furiosa is snatched from the Green Place of Many Mothers and falls into the hands of a great Biker Horde led by the Warlord Dementus. Sweeping through the Wasteland they come across the Citadel presided over by The Immortan Joe. While the two Tyrants war for dominance, Furiosa must survive many trials as she puts together the means to find her way home.",
            "popularity": 731.973,
            "poster_path": "/iADOJ8Zymht2JPMoy3R7xceZprc.jpg",
            "release_date": "2024-05-22",
            "title": "Furiosa: A Mad Max Saga",
            "video": false,
            "vote_average": 7.635,
            "vote_count": 876
        },
        {
            "adult": false,
            "backdrop_path": "/kti9ufHhCKaOLjg2to4RKfrlkmh.jpg",
            "genre_ids": [
                16,
                28
            ],
            "id": 1263421,
            "original_language": "ja",
            "original_title": "範馬刃牙VSケンガンアシュラ",
            "overview": "It's the ultimate showdown. The toughest fighters from \"Baki Hanma\" and \"Kengan Ashura\" clash in this unprecedented, hard-hitting martial arts crossover.",
            "popularity": 715.226,
            "poster_path": "/etbHJxil0wHvYOCmibzFLsMcl2C.jpg",
            "release_date": "2024-06-05",
            "title": "Baki Hanma VS Kengan Ashura",
            "video": false,
            "vote_average": 8.099,
            "vote_count": 121
        },
        {
            "adult": false,
            "backdrop_path": "/kYgQzzjNis5jJalYtIHgrom0gOx.jpg",
            "genre_ids": [
                16,
                28,
                10751,
                35,
                14
            ],
            "id": 1011985,
            "original_language": "en",
            "original_title": "Kung Fu Panda 4",
            "overview": "Po is gearing up to become the spiritual leader of his Valley of Peace, but also needs someone to take his place as Dragon Warrior. As such, he will train a new kung fu practitioner for the spot and will encounter a villain called the Chameleon who conjures villains from the past.",
            "popularity": 734.813,
            "poster_path": "/kDp1vUBnMpe8ak4rjgl3cLELqjU.jpg",
            "release_date": "2024-03-02",
            "title": "Kung Fu Panda 4",
            "video": false,
            "vote_average": 7.119,
            "vote_count": 1971
        },
        {
            "adult": false,
            "backdrop_path": "/11G6N5zW0KykVS0EcNKeXHUmQj8.jpg",
            "genre_ids": [
                10752
            ],
            "id": 1136318,
            "original_language": "en",
            "original_title": "Battle Over Britain",
            "overview": "A young pilot, fresh out of training, is called to join a Flight while they wait for the call to scramble. Throughout a single day, he witnesses the skies of southern England filled with deadly dog fights, and after every exhausting battle the men return to their dispersal hut, only to find another of their number missing. Unwilling to surrender, the pilot and his comrades unite to take to the skies once more, determined to defend not only the airfield, but their entire country.",
            "popularity": 690.449,
            "poster_path": "/8htJ7keZTwa08aC9OKyiqaq1cNJ.jpg",
            "release_date": "2023-12-01",
            "title": "Battle Over Britain",
            "video": false,
            "vote_average": 6.315,
            "vote_count": 27
        },
        {
            "adult": false,
            "backdrop_path": "/tkHQ7tnYYUEnqlrKuhufIsSVToU.jpg",
            "genre_ids": [
                27
            ],
            "id": 437342,
            "original_language": "en",
            "original_title": "The First Omen",
            "overview": "When a young American woman is sent to Rome to begin a life of service to the church, she encounters a darkness that causes her to question her own faith and uncovers a terrifying conspiracy that hopes to bring about the birth of evil incarnate.",
            "popularity": 674.397,
            "poster_path": "/uGyiewQnDHPuiHN9V4k2t9QBPnh.jpg",
            "release_date": "2024-04-03",
            "title": "The First Omen",
            "video": false,
            "vote_average": 6.775,
            "vote_count": 488
        }
    ],
    "total_pages": 44673,
    "total_results": 893453
}

RESULTADO:

![image](https://github.com/aportillo16/MoviesWithRealmDB/assets/166572036/1a94d0df-0744-4fd1-9a34-66092e9ce502)
