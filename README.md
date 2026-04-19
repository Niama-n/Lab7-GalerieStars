## GalerieStars – RecyclerView, Animations et Filtrage

## 🎬Vidéo de démonstration

Vous pouvez visualiser le test de l'application ici :
---



Le projet illustre la maîtrise des composants Android modernes, la gestion du cycle de vie, et l’interactivité entre les couches logique et graphique.
C est une application Android moderne permettant de consulter, rechercher et évaluer une liste de célébrités.
L’objectif de ce TP est de créer une application Android complète permettant d’afficher une galerie de stars (personnalités célèbres) sous forme de liste avec images circulaires, notes, filtrage par nom, et animations d’introduction.
L’apprenant découvrira :

le RecyclerView et le pattern ViewHolder,
la gestion des adapters personnalisés,
les animations dans Android,
l’utilisation de Glide pour le chargement d’images distantes,
la mise en œuvre d’un filtrage dynamique via une barre de recherche (SearchView).

## 🚀 Fonctionnalités

- Une animation d’accueil fluide s’affiche au lancement à travers un SplashScreen, offrant une transition élégante vers l’écran principal.
- Une liste verticale de stars est présentée à l’aide d’un RecyclerView, chaque élément affichant une image circulaire et une note moyenne.
- Un filtrage instantané des noms est disponible via la barre de recherche (SearchView), permettant de retrouver rapidement un acteur ou une actrice.
- Un menu de partage intégré dans la Toolbar permet de partager l’application sur différentes plateformes (Gmail, WhatsApp, etc.).
- Au clic sur un élément de la liste, un popup personnalisé s’affiche et permet de modifier la note (rating) d’un acteur ou d’une actrice en temps réel.
- Une mise à jour dynamique de la liste est effectuée après chaque modification grâce à la méthode notifyItemChanged().
- Une architecture propre et réutilisable est adoptée, basée sur le modèle MVC avec des couches bien séparées (DAO, Service, Adapter).

## 🏗️ Architecture 

L'application suit le modèle **Modèle-Vue-Contrôleur (MVC)** pour une meilleure maintenance et réutilisation du code :

- **Modèle (Beans)** : Classe `Star` définissant les attributs (id, nom, image, note).
- **Service (DAO)** : Interface `IDao` et classe `StarService` pour la gestion des données (CRUD).
- **Vue (Layouts/Adapter)** : Fichiers XML (`star_item`, `star_edit_item`) et `StarAdapter` pour le rendu visuel.
- **Contrôleur (UI)** : `ListActivity` et `SplashActivity` pour la logique de navigation et d'interaction.

## 🛠️ Technologies utilisés

- **Glide** : Pour le chargement fluide des images depuis des URLs.
- **CircleImageView** : Pour l'affichage élégant des photos de stars en format circulaire.
- **AndroidX & Material Design** : Pour une interface utilisateur moderne et conforme aux standards de Google.
- **Java/Kotlin** : Développé avec le SDK Android 15 (API 35/36).

## Réalisé PAR
NAFTAOUI NIAMA


