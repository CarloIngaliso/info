
from django.db import models

class Utente(models.Model):
    name = models.CharField(max_length=50)
    surname = models.CharField(max_length=50)
    indirizzo = models.CharField(max_length=100)
    citta = models.CharField(max_length=50)
    telefono = models.CharField(max_length=10)

class Film(models.Model):
	name = models.CharField(max_length=50)
	regista = models.CharField(max_length=50)
	data = models.DateTimeField()
	prezzo = models.CharField(max_length=10)
	currency = models.CharField(max_length=10)

class Noleggio(models.Model):
    utente = models.ForeignKey(Utente, on_delete=models.CASCADE)
    film = models.ForeignKey(Film, on_delete=models.CASCADE)
    data = models.DateTimeField()

class Genere(models.Model):
    genere= models.CharField(max_length=50)


class GenereFilm(models.Model):
	genere = models.ForeignKey(Genere, on_delete=models.CASCADE)
	film = models.ForeignKey(Film, on_delete=models.CASCADE)

class Attori(models.Model):
    attori = models.CharField(max_length=50)

class FilmAttori(models.Model):
	attori = models.ForeignKey(Attori, on_delete=models.CASCADE)
	film = models.ForeignKey(Film, on_delete=models.CASCADE)