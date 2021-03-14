#Author: J�r�mie Facquet
#Keywords Summary : Testing par Cucumber
#Feature: Sc�narios pour la classe Pays

@tag
Feature: Ajout d'un pays frontalier
  En tant qu'utilisateur, je veux ajouter les pays frontaliers d'un objet pays donn�, 
  en faisant en sorte de ne pas avoir � modifier deux objets diff�rents et d'obtenir une coh�rence des donn�es

  @tag1
  Scenario: Ajouter un pays frontalier
    Given la creation d'un Pays 
    And sa liste de pays frontaliers initialisee vide
    When l'utilisateur lui ajoute un pays frontalier
    Then Les deux pays ont l'autre pays ajoute leur liste de pays frontaliers
   
   @tag2
   Scenario: Empêcher un pays de s'ajouter une frontière à lui-même
   	Given la creation d'un Pays
   	When l'utilisateur l'ajoute en tant que son propre pays frontalier
   	Then la liste des pays frontaliers du pays reste vide


    