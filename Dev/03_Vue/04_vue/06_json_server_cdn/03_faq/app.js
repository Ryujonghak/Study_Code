new Vue({
  el:'#app',
  data: {
    faqboards : [],
    faqboard : {},
    isUpdate:false,
    show:false,
    send:false
  },
  created() {
    this.retrive();
  },
  methods: {
    retrive() {
      axios.get('http://localhost:3000/faqboards')
      .then((res) => {
        console.log(res); //성공시
        this.faqboards = res.data;
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });
    },
    showForm(faq){
      this.show = true; 
      if((faq !== undefined)){
        this.faqboard = faq;
        this.isUpdate=true;
      }
    },
    btnOK(){
      this.send=true;
      //if(this.isUpdate == false) this.addEmployee();	
      (this.isUpdate == false)? this.addFaq() : this.updateFaq(this.faqboard.id);
    },
    btnCancel(){ 
      this.show=false; this.send=false; 
    },
    addFaq(){
      if(this.send == true){
        axios.post('http://localhost:3000/faqboards',
            { 
              "id": this.faqboard.id, 
              "subject": this.faqboard.subject, 
              "text": this.faqboard.text
            })
        .then((res) => { console.log(res);  })
        .catch((err) => { console.log(err);  }) //에러 발생시
        this.show=false;
        this.send=false;
      }
    },
    updateFaq(id){
      axios.put('http://localhost:3000/faqboards/'+id,{
        "id": this.faqboard.id,
        "subject": this.faqboard.subject,
        "text": this.faqboard.text
      }) 
      .then((res) => {
        console.log(res); //성공시
        this.isUpdate =false;
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });     
    },
    deleteFaq(id){
      axios.delete('http://localhost:3000/faqboards/'+id)
      // .then((res) => { this.faqboard.splice(id, 1); })
      .then((res) => { this.retrive(); })
      .catch((err) => { console.log(err); }); 
    }
  }
})
