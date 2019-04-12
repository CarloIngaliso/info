from django.http import HttpResponse

from .models import Film


def index(request):
    latest_question_list = Film.objects.order_by('-pub_date')[:5]
    output = ', '.join([q.name for q in latest_question_list])
    return HttpResponse(output)