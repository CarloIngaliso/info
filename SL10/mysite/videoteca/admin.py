from django.contrib import admin

from .models import Film
from .models import Genere
from .models import	Attori
admin.site.register(Film)
admin.site.register(Genere)
admin.site.register(Attori)