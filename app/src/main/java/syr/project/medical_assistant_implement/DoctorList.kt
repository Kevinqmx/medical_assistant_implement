package syr.project.medical_assistant_implement

import com.google.gson.Gson

class DoctorList{
    var doctorList: List<DoctorData> = Gson().fromJson(doctors, Array<DoctorData>::class.java).asList()
    var doctorTable:MutableMap<Int, Int> = mutableMapOf()
    init{



        doctorTable[doctorList[0].id]=R.drawable.maledoctor1
        doctorTable[doctorList[1].id]=R.drawable.maledoctor1
        doctorTable[doctorList[2].id]=R.drawable.maledoctor1
        doctorTable[doctorList[3].id]=R.drawable.maledoctor1
        doctorTable[doctorList[4].id]=R.drawable.maledoctor1
        doctorTable[doctorList[5].id]=R.drawable.maledoctor1



    }
}

var doctors="""
    [
        {
          "id": "0",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        },
        {
          "id": "1",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        },
        {
          "id": "2",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        },
        {
          "id": "3",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        },
        {
          "id": "4",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        },
        {
          "id": "5",
          "title": "Dr",
          "name": Amani,
          "degree": "MD",
          "specialty": "Primary care doctor",
          "vote_average": "4.9",
          "location": "Barnes Center at the Arch",
        }

        

        
        
    ]

    
    
    
    
""".trimIndent()