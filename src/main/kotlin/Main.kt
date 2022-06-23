fun main() {
    val service = NoteService()

    service.addNote(Note())
    service.createComment(Comment(noteId = 1))
    val e = service.createComment(Comment(noteId = 1))
    service.createComment(Comment(noteId = 1))
    println(service.comments)
    println(service.deletedComments)

    service.deleteComment(e)
    println(service.comments)
    println(service.deletedComments)

    service.restoreComment(Comment(id=8))
    println(service.comments)
    println(service.deletedComments)

}