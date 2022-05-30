$(document).ready(function(){

var page_url=window.location.href;

var page_id=page_url.substring(page_url.lastIndexOf("#")+1);
// alert(page_id);
if(page_id=="scroll-best"){
    $("html,body").animate({
        scrollTop:$("#scroll-"+page_id).offset().top
    },1000);

}
})