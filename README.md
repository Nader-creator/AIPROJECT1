# AIPROJECT1
i. Description of your understanding of the problem
The Project concern is about finding the path between two UBAHN stations .
We used a HashMap of arraylist to track the nodes and edges .
each station with a line form a node in the graph .
we used the traditional heurestic function which the distance function ! 
`G.Astar("U Uhlandstr", "U1", "U Gleisdreieck", "U3");`

Total distance traveled: 14.0
1: U Uhlandstr U1
2: U Kurfürstendamm U1
3: U Wittenbergplatz U1
4: U Nollendorfplatz U1
5: U Kurfürstenstr U1
6: U Gleisdreieck U1
7: U Gleisdreieck U3


`G.dfs("U Uhlandstr", "U1", "U Gleisdreieck", "U3");`

[U Uhlandstr U1, U Kurfürstendamm U1, U Kurfürstendamm U1, U Wittenbergplatz U1, U Wittenbergplatz U1, U Nollendorfplatz U1, U Nollendorfplatz U1, U Kurfürstenstr U1, U Kurfürstenstr U1, U Gleisdreieck U1, U Gleisdreieck U1, U Möckernbrücke U1, U Möckernbrücke U1, U Hallesches Tor U1, U Hallesches Tor U1, U Prinzenstr U1, U Prinzenstr U1, U Kottbusser Tor U1, U Kottbusser Tor U1, U Görlitzer Bahnhof U1, U Görlitzer Bahnhof U1, U Schlesisches Tor U1, U Schlesisches Tor U1, U Schlesisches Tor U3, U Schlesisches Tor U3, U Görlitzer Bahnhof U3, U Görlitzer Bahnhof U3, U Kottbusser Tor U3, U Kottbusser Tor U3, U Prinzenstr U3, U Prinzenstr U3, U Hallesches Tor U3, U Hallesches Tor U3, U Möckernbrücke U3, U Möckernbrücke U3, U Gleisdreieck U3]

[U Uhlandstr U1, U Kurfürstendamm U1, U Kurfürstendamm U1, U Wittenbergplatz U1, U Wittenbergplatz U1, U Nollendorfplatz U1, U Nollendorfplatz U1, U Kurfürstenstr U1, U Kurfürstenstr U1, U Gleisdreieck U1, U Gleisdreieck U1, U Möckernbrücke U1, U Möckernbrücke U1, U Hallesches Tor U1, U Hallesches Tor U1, U Prinzenstr U1, U Prinzenstr U1, U Kottbusser Tor U1, U Kottbusser Tor U1, U Görlitzer Bahnhof U1, U Görlitzer Bahnhof U1, U Schlesisches Tor U1, U Schlesisches Tor U1, U Schlesisches Tor U3, U Gleisdreieck U2, U Gleisdreieck U2, U Bülowstr U2, U Bülowstr U2, U Nollendorfplatz U2, U Nollendorfplatz U2, U Wittenbergplatz U2, U Wittenbergplatz U2, S+U Zoologischer Garten Bhf U2, S+U Zoologischer Garten Bhf U2, U Ernst-Reuter-Platz U2, U Ernst-Reuter-Platz U2, U Deutsche Oper U2, U Deutsche Oper U2, U Bismarckstr U2, U Bismarckstr U2, U Sophie-Charlotte-Platz U2, U Sophie-Charlotte-Platz U2, U Kaiserdamm U2, U Wittenbergplatz U3, U Wittenbergplatz U3, U Augsburger Str U3, U Augsburger Str U3, U Spichernstr U3, U Spichernstr U3, U Hohenzollernplatz U3, U Hohenzollernplatz U3, U Fehrbelliner Platz U3, U Fehrbelliner Platz U3, S+U Heidelberger Platz U3, S+U Heidelberger Platz U3, U Rüdesheimer Platz U3, U Rüdesheimer Platz U3, U Breitenbachplatz U3, U Nollendorfplatz U3, U Nollendorfplatz U3, U Kurfürstenstr U3, U Kurfürstenstr U3, U Gleisdreieck U3]

[U Uhlandstr U1, U Kurfürstendamm U1, U Kurfürstendamm U1, U Wittenbergplatz U1, U Wittenbergplatz U1, U Nollendorfplatz U1, U Nollendorfplatz U1, U Kurfürstenstr U1, U Kurfürstenstr U1, U Gleisdreieck U1, U Gleisdreieck U1, U Möckernbrücke U1, U Möckernbrücke U1, U Hallesches Tor U1, U Hallesches Tor U1, U Prinzenstr U1, U Prinzenstr U1, U Kottbusser Tor U1, U Kottbusser Tor U1, U Görlitzer Bahnhof U1, U Görlitzer Bahnhof U1, U Schlesisches Tor U1, U Schlesisches Tor U1, U Schlesisches Tor U3, U Gleisdreieck U2, U Gleisdreieck U2, U Bülowstr U2, U Bülowstr U2, U Nollendorfplatz U2, U Nollendorfplatz U2, U Wittenbergplatz U2, U Wittenbergplatz U2, S+U Zoologischer Garten Bhf U2, S+U Zoologischer Garten Bhf U2, U Ernst-Reuter-Platz U2, U Ernst-Reuter-Platz U2, U Deutsche Oper U2, U Deutsche Oper U2, U Bismarckstr U2, U Bismarckstr U2, U Sophie-Charlotte-Platz U2, U Sophie-Charlotte-Platz U2, U Kaiserdamm U2, U Wittenbergplatz U3, U Wittenbergplatz U3, U Augsburger Str U3, U Augsburger Str U3, U Spichernstr U3, U Spichernstr U3, U Hohenzollernplatz U3, U Hohenzollernplatz U3, U Fehrbelliner Platz U3, U Fehrbelliner Platz U3, S+U Heidelberger Platz U3, S+U Heidelberger Platz U3, U Rüdesheimer Platz U3, U Rüdesheimer Platz U3, U Breitenbachplatz U3, U Nollendorfplatz U3, U Nollendorfplatz U3, U Kurfürstenstr U3, U Mendelssohn-Bartholdy-Park U2, U Mendelssohn-Bartholdy-Park U2, S+U Potsdamer Platz U2, S+U Potsdamer Platz U2, U Mohrenstr U2, U Mohrenstr U2, Berlin U2, Berlin U2, U Stadtmitte U2 U2, U Stadtmitte U2 U2, U Hausvogteiplatz U2, U Hausvogteiplatz U2, U Spittelmarkt U2, U Spittelmarkt U2, U Gleisdreieck U3]

[U Uhlandstr U1, U Kurfürstendamm U1, U Kurfürstendamm U1, U Wittenbergplatz U1, U Wittenbergplatz U1, U Nollendorfplatz U1, U Nollendorfplatz U1, U Kurfürstenstr U1, U Kurfürstenstr U1, U Gleisdreieck U1, U Gleisdreieck U1, U Möckernbrücke U1, U Möckernbrücke U1, U Hallesches Tor U1, U Hallesches Tor U1, U Prinzenstr U1, U Prinzenstr U1, U Kottbusser Tor U1, U Kottbusser Tor U1, U Görlitzer Bahnhof U1, U Görlitzer Bahnhof U1, U Schlesisches Tor U1, U Schlesisches Tor U1, U Schlesisches Tor U3, U Gleisdreieck U2, U Gleisdreieck U2, U Bülowstr U2, U Bülowstr U2, U Nollendorfplatz U2, U Nollendorfplatz U2, U Wittenbergplatz U2, U Wittenbergplatz U2, S+U Zoologischer Garten Bhf U2, S+U Zoologischer Garten Bhf U2, U Ernst-Reuter-Platz U2, U Ernst-Reuter-Platz U2, U Deutsche Oper U2, U Deutsche Oper U2, U Bismarckstr U2, U Bismarckstr U2, U Sophie-Charlotte-Platz U2, U Sophie-Charlotte-Platz U2, U Kaiserdamm U2, U Wittenbergplatz U3, U Wittenbergplatz U3, U Augsburger Str U3, U Augsburger Str U3, U Spichernstr U3, U Spichernstr U3, U Hohenzollernplatz U3, U Hohenzollernplatz U3, U Fehrbelliner Platz U3, U Fehrbelliner Platz U3, S+U Heidelberger Platz U3, S+U Heidelberger Platz U3, U Rüdesheimer Platz U3, U Rüdesheimer Platz U3, U Breitenbachplatz U3, U Nollendorfplatz U3, U Nollendorfplatz U3, U Kurfürstenstr U3, U Mendelssohn-Bartholdy-Park U2, U Mendelssohn-Bartholdy-Park U2, S+U Potsdamer Platz U2, S+U Potsdamer Platz U2, U Mohrenstr U2, U Mohrenstr U2, Berlin U2, Berlin U2, U Stadtmitte U2 U2, U Stadtmitte U2 U2, U Hausvogteiplatz U2, U Hausvogteiplatz U2, U Spittelmarkt U2, U Gleisdreieck U3]

A* expands less nodes than dfs and bfs and get to the result much faster than (DFS & BFS )

# Hazem Abdelalim 37-18002
# Ali Sayed Mohamed 37-5612
# Nader Ramsis 37-318 
# Abadir Hany 
