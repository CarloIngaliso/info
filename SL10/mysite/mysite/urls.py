from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path('videoteca/', include('videoteca.urls')),
    path('admin/', admin.site.urls),
]