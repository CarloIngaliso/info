from django.urls import path

from . import views

urlpatterns = [
    # ex: /videoteca/
	path('', views.index, name='index'),
]
