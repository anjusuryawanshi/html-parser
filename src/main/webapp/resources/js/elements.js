$(document).ready(function () {
  $('.tagcount a').click(function () {
    $('.tag-highlight').removeClass('tag-highlight');
    $('.tag-' + this.text).addClass('tag-highlight');
  });
});
